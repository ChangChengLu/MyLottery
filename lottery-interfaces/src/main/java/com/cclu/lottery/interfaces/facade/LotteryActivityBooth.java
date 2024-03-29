package com.cclu.lottery.interfaces.facade;

import com.alibaba.fastjson.JSON;
import com.cclu.lottery.application.process.IActivityProcess;
import com.cclu.lottery.application.process.req.DrawProcessReq;
import com.cclu.lottery.application.process.res.DrawProcessResult;
import com.cclu.lottery.application.process.res.RuleQuantificationCrowdResult;
import com.cclu.lottery.common.Constants;
import com.cclu.lottery.domain.rule.model.req.DecisionMatterReq;
import com.cclu.lottery.domain.strategy.model.vo.DrawAwardVO;
import com.cclu.lottery.interfaces.assembler.IMapping;
import com.cclu.lottery.rpc.ILotteryActivityBooth;
import com.cclu.lottery.rpc.dto.AwardDTO;
import com.cclu.lottery.rpc.req.DrawReq;
import com.cclu.lottery.rpc.req.QuantificationDrawReq;
import com.cclu.lottery.rpc.res.DrawRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author ChangCheng Lu
 * @date 2023/11/25 14:31
 * @description 抽奖活动展台
 * @copyright ChangChengLu
 */
@Slf4j
@Controller
public class LotteryActivityBooth implements ILotteryActivityBooth {

    @Resource
    private IActivityProcess activityProcess;

    @Resource
    private IMapping<DrawAwardVO, AwardDTO> awardMapping;

    @Override
    public DrawRes doDraw(DrawReq drawReq) {
        try {
            log.info("抽奖，开始 uId：{} activityId：{}", drawReq.getUId(), drawReq.getActivityId());

            // 1. 执行抽奖
            DrawProcessResult drawProcessResult = activityProcess.doDrawProcess(new DrawProcessReq(drawReq.getUId(), drawReq.getActivityId()));
            if (!Constants.ResponseCode.SUCCESS.getCode().equals(drawProcessResult.getCode())) {
                log.error("抽奖，失败(抽奖过程异常) uId：{} activityId：{}", drawReq.getUId(), drawReq.getActivityId());
                return new DrawRes(drawProcessResult.getCode(), drawProcessResult.getInfo());
            }

            // 2. 数据转换
            DrawAwardVO drawAwardVO = drawProcessResult.getDrawAwardVO();
            AwardDTO awardDTO = awardMapping.sourceToTarget(drawAwardVO);
            awardDTO.setActivityId(drawReq.getActivityId());

            // 3. 封装数据
            DrawRes drawRes = new DrawRes(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo());
            drawRes.setAwardDTO(awardDTO);

            log.info("抽奖，完成 uId：{} activityId：{} drawRes：{}", drawReq.getUId(), drawReq.getActivityId(), JSON.toJSONString(drawRes));

            return drawRes;
        } catch (Exception e) {
            log.error("抽奖，失败 uId：{} activityId：{} reqJson：{}", drawReq.getUId(), drawReq.getActivityId(), JSON.toJSONString(drawReq), e);
            return new DrawRes(Constants.ResponseCode.UN_ERROR.getCode(), Constants.ResponseCode.UN_ERROR.getInfo());
        }
    }

    @Override
    public DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq) {
        try {
            log.info("量化人群抽奖，开始 uId：{} treeId：{}", quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId());

            // 1. 执行规则引擎，获取用户可以参与的活动号
            RuleQuantificationCrowdResult ruleQuantificationCrowdResult = activityProcess.doRuleQuantificationCrowd(new DecisionMatterReq(quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId(), quantificationDrawReq.getValMap()));
            if (!Constants.ResponseCode.SUCCESS.getCode().equals(ruleQuantificationCrowdResult.getCode())) {
                log.error("量化人群抽奖，失败(规则引擎执行异常) uId：{} treeId：{}", quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId());
                return new DrawRes(ruleQuantificationCrowdResult.getCode(), ruleQuantificationCrowdResult.getInfo());
            }

            // 2. 执行抽奖
            Long activityId = ruleQuantificationCrowdResult.getActivityId();
            DrawProcessResult drawProcessResult = activityProcess.doDrawProcess(new DrawProcessReq(quantificationDrawReq.getUId(), activityId));
            if (!Constants.ResponseCode.SUCCESS.getCode().equals(drawProcessResult.getCode())) {
                log.error("量化人群抽奖，失败(抽奖过程异常) uId：{} treeId：{}", quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId());
                return new DrawRes(drawProcessResult.getCode(), drawProcessResult.getInfo());
            }

            // 3. 数据转换
            DrawAwardVO drawAwardVO = drawProcessResult.getDrawAwardVO();
            AwardDTO awardDTO = awardMapping.sourceToTarget(drawAwardVO);
            awardDTO.setActivityId(activityId);

            // 4. 封装数据
            DrawRes drawRes = new DrawRes(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo());
            drawRes.setAwardDTO(awardDTO);

            log.info("量化人群抽奖，完成 uId：{} treeId：{} drawRes：{}", quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId(), JSON.toJSONString(drawRes));

            return drawRes;
        } catch (Exception e) {
            log.error("量化人群抽奖，失败 uId：{} treeId：{} reqJson：{}", quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId(), JSON.toJSONString(quantificationDrawReq), e);
            return new DrawRes(Constants.ResponseCode.UN_ERROR.getCode(), Constants.ResponseCode.UN_ERROR.getInfo());
        }
    }

}
