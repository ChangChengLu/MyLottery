package com.cclu.lottery.infrastructure.dao;

import com.cclu.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChangCheng Lu
 * @date 2023/10/28 22:27
 * @description
 * @copyright ChangChengLu
 */
@Mapper
public interface IStrategyDao {

    /**
     * 插入策略配置
     *
     * @param req 策略配置
     */
    void insert(Strategy req);

    /**
     * 查询策略配置信息
     * @param strategyId 策略ID
     * @return 策略配置PO
     */
    Strategy queryStrategy(Long strategyId);

}
