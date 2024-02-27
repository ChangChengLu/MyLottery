package com.cclu.lottery.domain.activity.model.aggregates;

import com.cclu.lottery.domain.activity.model.vo.ActivityVO;
import com.cclu.lottery.domain.activity.model.vo.AwardVO;
import com.cclu.lottery.domain.activity.model.vo.StrategyVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/11/5 14:16
 * @description 活动配置聚合信息
 * @copyright ChangChengLu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityConfigRich {

    /**
     * 活动配置
     */
    private ActivityVO activity;

    /**
     * 策略配置(含策略明细)
     */
    private StrategyVO strategy;

    /**
     * 奖品配置
     */
    private List<AwardVO> awardList;

}
