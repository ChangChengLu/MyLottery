package com.cclu.lottery.domain.strategy.model.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ChangCheng Lu
 * @date 2023/11/5 14:26
 * @description 策略明细简要信息
 * @copyright ChangChengLu
 */
@Data
public class StrategyDetailBriefVO {

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 奖品库存
     */
    private Integer awardCount;

    /**
     * 奖品剩余库存
     */
    private Integer awardSurplusCount;

    /**
     * 中奖概率
     */
    private BigDecimal awardRate;

}
