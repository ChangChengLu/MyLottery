package com.cclu.lottery.infrastructure.po;

import lombok.Data;

import java.util.Date;

/**
 * @author ChangCheng Lu
 * @date 2023/10/28 22:21
 * @description 策略信息
 * @copyright ChangChengLu
 */
@Data
public class Strategy {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 策略描述
     */
    private String strategyDesc;

    /**
     * 策略方式「1:单项概率、2:总体概率」
     */
    private Integer strategyMode;

    /**
     * 发放奖品方式「1:即时、2:定时[含活动结束]、3:人工」
     */
    private Integer grantType;

    /**
     * 发放奖品时间
     */
    private Date grantDate;

    /**
     * 拓展信息
     */
    private String extInfo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
