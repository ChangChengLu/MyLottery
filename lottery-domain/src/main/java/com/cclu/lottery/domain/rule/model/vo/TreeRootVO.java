package com.cclu.lottery.domain.rule.model.vo;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 8:40
 * @description 规则树根配置
 * @copyright ChangChengLu
 */
@Data
public class TreeRootVO {

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 规则树根ID
     */
    private Long treeRootNodeId;

    /**
     * 规则树名称
     */
    private String treeName;

}
