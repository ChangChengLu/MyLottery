package com.cclu.lottery.domain.award.service.goods;

import com.cclu.lottery.domain.award.repository.IOrderRepository;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * @author ChangCheng Lu
 * @date 2023/11/3 22:11
 * @description
 * @copyright ChangChengLu
 */
@Slf4j
public class DistributionBase {

    @Resource
    private IOrderRepository awardRepository;

    protected void updateUserAwardState(String uId, Long orderId, String awardId, Integer awardState, String awardStateInfo) {
        // TODO 后期添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态
        log.info("TODO 后期添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态 uId：{}", uId);
    }

}
