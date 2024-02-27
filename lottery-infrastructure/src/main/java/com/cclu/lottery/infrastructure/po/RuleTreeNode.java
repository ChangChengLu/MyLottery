package com.cclu.lottery.infrastructure.po;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 10:20
 * @description 规则树节点
 * @copyright ChangChengLu
 */
@Data
public class RuleTreeNode {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 节点类型:
     * 1. 子叶
     * 2. 果实
     */
    private Integer nodeType;

    /**
     * 节点值[nodeType=2]：果实值
     */
    private String nodeValue;

    /**
     * 规则Key
     */
    private String ruleKey;

    /**
     * 规则描述
     */
    private String ruleDesc;

}
