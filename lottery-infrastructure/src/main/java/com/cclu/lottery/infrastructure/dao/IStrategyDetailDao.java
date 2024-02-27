package com.cclu.lottery.infrastructure.dao;

import com.cclu.lottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/10/28 22:27
 * @description
 * @copyright ChangChengLu
 */
@Mapper
public interface IStrategyDetailDao {

    /**
     * 查询某一个配置信息策略明细列表
     * @param strategyId 策略配置ID
     * @return 策略明细列表
     */
    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

    /**
     * 查询无库存策略奖品ID
     * @param strategy 策略ID
     * @return 无库存策略奖品ID集合
     */
    List<String> queryNoStockStrategyAwardList(Long strategy);

    /**
     *扣减库存
     * @param strategyDetailReq 策略ID、奖品ID
     * @return                  返回结果
     */
    int deductStock(StrategyDetail strategyDetailReq);

    /**
     * 插入策略配置组
     * @param list 策略配置组
     */
    void insertList(List<StrategyDetail> list);

}
