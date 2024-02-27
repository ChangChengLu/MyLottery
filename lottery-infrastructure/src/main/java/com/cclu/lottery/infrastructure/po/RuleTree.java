package com.cclu.lottery.infrastructure.po;

import lombok.Data;

import java.util.Date;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 10:20
 * @description 规则树
 * @copyright ChangChengLu
 */
@Data
public class RuleTree {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 规则树名称
     */
    private String treeName;

    /**
     * 规则树描述
     */
    private String treeDesc;

    /**
     * 规则树根ID
     */
    private Long treeRootNodeId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
