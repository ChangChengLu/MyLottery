package com.cclu.lottery.domain.rule.model.vo;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 8:45
 * @description
 * @copyright ChangChengLu
 */
@Data
public class TreeNodeLineVO {

    /**
     * 节点 From
     */
    private Long nodeIdFrom;

    /**
     * 节点 To
     */
    private Long nodeIdTo;

    /**
     * 限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
     */
    private Integer ruleLimitType;

    /**
     * 限定值
     */
    private String ruleLimitValue;

}
