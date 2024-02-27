package com.cclu.lottery.domain.activity.model.vo;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/11/20 9:25
 * @description 用户领取活动记录
 * @copyright ChangChengLu
 */
@Data
public class UserTakeActivityVO {

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动领取ID
     */
    private Long takeId;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 活动单使用状态
     * 0 未使用
     * 1 已使用
     * Constants.TakeState
     */
    private Integer state;

}
