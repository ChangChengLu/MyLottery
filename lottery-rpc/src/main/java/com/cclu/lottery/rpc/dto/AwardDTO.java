package com.cclu.lottery.rpc.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ChangCheng Lu
 * @date 2023/11/25 14:26
 * @description 奖品信息
 * @copyright ChangChengLu
 */
@Data
public class AwardDTO implements Serializable {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）
     */
    private Integer awardType;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 奖品内容
     */
    private String awardContent;

    /**
     * 抽奖策略方式 1:单项概率 2:总体概率
     */
    private Integer strategyMode;

    /**
     * 发放奖品方式（1:即时、2:定时[含活动结束]、3:人工）
     */
    private Integer grantType;

    /**
     * 发奖时间
     */
    private Date grantDate;

}