package com.cclu.lottery.domain.strategy.model.aggregates;

import com.cclu.lottery.domain.strategy.model.vo.StrategyBriefVO;
import com.cclu.lottery.domain.strategy.model.vo.StrategyDetailBriefVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/10/28 22:58
 * @description 策略聚合对象
 * @copyright ChangChengLu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StrategyRich {

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 策略配置
     */
    private StrategyBriefVO strategy;

    /**
     * 策略明细
     */
    private List<StrategyDetailBriefVO> strategyDetailList;

}
