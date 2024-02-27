package com.cclu.lottery.domain.award.service.goods.impl;

import com.cclu.lottery.common.Constants;
import com.cclu.lottery.domain.award.model.req.GoodsReq;
import com.cclu.lottery.domain.award.model.res.DistributionRes;
import com.cclu.lottery.domain.award.service.goods.DistributionBase;
import com.cclu.lottery.domain.award.service.goods.IDistributionGoods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author ChangCheng Lu
 * @date 2023/11/3 22:17
 * @description 实物发货类商品
 * @copyright ChangChengLu
 */
@Component
@Slf4j
public class PhysicalGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用实物发奖
        log.info("模拟调用实物发奖 uId：{} awardContent：{}", req.getUId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getUId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getUId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.PhysicalGoods.getCode();
    }


}
