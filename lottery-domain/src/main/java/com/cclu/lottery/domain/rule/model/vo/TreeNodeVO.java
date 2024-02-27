package com.cclu.lottery.domain.rule.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 8:43
 * @description 规则树节点信息
 * @copyright ChangChengLu
 */
@Data
public class TreeNodeVO {

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 规则树节点ID
     */
    private Long treeNodeId;

    /**
     * 节点类型；1子叶、2果实
     */
    private Integer nodeType;

    /**
     * 节点值[nodeType=2]: 果实值
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

    /**
     * 节点链路(该节点的全部子节点)
     */
    private List<TreeNodeLineVO> treeNodeLineInfoList;

}
