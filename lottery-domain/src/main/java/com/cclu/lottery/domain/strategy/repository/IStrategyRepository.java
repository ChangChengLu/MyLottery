package com.cclu.lottery.domain.strategy.repository;

import com.cclu.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.cclu.lottery.domain.strategy.model.vo.AwardBriefVO;

import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/10/28 23:03
 * @description Strategy领域对象仓储服务
 * @copyright ChangChengLu
 */
public interface IStrategyRepository {

    /**
     * 封装 StrategyRich 对象
     * @param strategyId 策略ID
     * @return StrategyRich 聚合对象
     */
    StrategyRich queryStrategyRich(Long strategyId);

    /**
     * 查询奖品信息
     * @param awardId 奖品ID
     * @return 奖品PO
     */
    AwardBriefVO queryAwardInfo(String awardId);

    /**
     * 查询无库存策略奖品ID
     * @param strategyId 策略ID
     * @return 无库存策略奖品ID集合
     */
    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);

}
