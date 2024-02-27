package com.cclu.lottery.domain.strategy.service.draw;

import com.cclu.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.cclu.lottery.domain.strategy.model.vo.AwardBriefVO;
import com.cclu.lottery.domain.strategy.repository.IStrategyRepository;

import javax.annotation.Resource;

/**
 * @author ChangCheng Lu
 * @date 2023/11/2 20:33
 * @description 抽奖策略数据支撑，一些通用的数据服务
 * @copyright ChangChengLu
 */
public class DrawStrategySupport extends DrawConfig {

    @Resource
    protected IStrategyRepository strategyRepository;

    /**
     * 封装 StrategyRich 对象
     * @param strategyId 策略ID
     * @return StrategyRich 聚合对象
     */
    protected StrategyRich queryStrategyRich(Long strategyId) {
        return strategyRepository.queryStrategyRich(strategyId);
    }

    /**
     * 查询奖品详情信息
     *
     * @param awardId 奖品ID
     * @return 中奖详情
     */
    protected AwardBriefVO queryAwardInfoByAwardId(String awardId) {
        return strategyRepository.queryAwardInfo(awardId);
    }

}
