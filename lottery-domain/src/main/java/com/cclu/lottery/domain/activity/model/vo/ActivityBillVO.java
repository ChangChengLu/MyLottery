package com.cclu.lottery.domain.activity.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author ChangCheng Lu
 * @date 2023/11/19 16:31
 * @description 活动账单【库存、状态、日期、个人参与次数】
 * @copyright ChangChengLu
 */
@Data
public class ActivityBillVO {

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动开始时间
     */
    private Date beginDateTime;

    /**
     * 活动结束时间
     */
    private Date endDateTime;

    /**
     * 库存剩余
     */
    private Integer stockSurplusCount;

    /**
     * 活动状态：1编辑、2提审、3撤审、4通过、5运行(审核通过后worker扫描状态)、6拒绝、7关闭、8开启
     * Constants.ActivityState
     */
    private Integer state;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 每人可参与次数
     */
    private Integer takeCount;

    /**
     * 已领取次数
     */
    private Integer userTakeLeftCount;

}
