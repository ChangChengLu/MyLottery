package com.cclu.lottery.application.process;

import com.cclu.lottery.application.process.req.DrawProcessReq;
import com.cclu.lottery.application.process.res.DrawProcessResult;
import com.cclu.lottery.application.process.res.RuleQuantificationCrowdResult;
import com.cclu.lottery.domain.rule.model.req.DecisionMatterReq;

/**
 * @author ChangCheng Lu
 * @date 2023/11/21 14:11
 * @description 活动抽奖流程编排接口
 * @copyright ChangChengLu
 */
public interface IActivityProcess {

    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);

    /**
     * 规则量化人群，返回可参与的活动ID
     * @param req   规则请求
     * @return      量化结果，用户可以参与的活动ID
     */
    RuleQuantificationCrowdResult doRuleQuantificationCrowd(DecisionMatterReq req);

}
