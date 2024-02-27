package com.cclu.lottery.infrastructure.po;

import lombok.Data;

import java.util.Date;

/**
 * @author ChangCheng Lu
 * @date 2023/11/19 16:43
 * @description 用户活动参与次数表
 * @copyright ChangChengLu
 */
@Data
public class UserTakeActivityCount {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 可领取次数
     */
    private Integer totalCount;

    /**
     * 已领取次数
     */
    private Integer leftCount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
