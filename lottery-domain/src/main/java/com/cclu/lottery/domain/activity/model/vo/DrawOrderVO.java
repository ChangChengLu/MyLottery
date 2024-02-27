package com.cclu.lottery.domain.activity.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author ChangCheng Lu
 * @date 2023/11/21 10:19
 * @description 奖品单
 * @copyright ChangChengLu
 */
@Data
public class DrawOrderVO {

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 活动领取ID
     */
    private Long takeId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 策略方式
     * 1. 单向概率
     * 2. 总体概率
     */
    private Integer strategyMode;

    /**
     * 发放奖品方式
     * 1. 即时
     * 2. 定时(含活动结束)
     * 3. 人工
     */
    private Integer grantType;

    /**
     * 奖品发放时间
     */
    private Date grantDate;

    /**
     * 发奖状态
     */
    private Integer grantState;

    /**
     * 发奖ID
     */
    private String awardId;

    /**
     * 奖品类型
     * 1. 文字描述
     * 2. 兑换码
     * 3. 优惠卷
     * 4. 实物奖品
     */
    private Integer awardType;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 奖品内容
     * 1. 文字描述
     * 2. Key
     * 3. 码
     */
    private String awardContent;

}
