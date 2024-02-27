package com.cclu.lottery.domain.rule.model.req;

import lombok.Data;

import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 8:52
 * @description 决策物料
 * @copyright ChangChengLu
 */
@Data
public class DecisionMatterReq {

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 决策值
     */
    private Map<String, Object> valMap;

    public DecisionMatterReq() {
    }

    public DecisionMatterReq(String userId, Long treeId, Map<String, Object> valMap) {
        this.userId = userId;
        this.treeId = treeId;
        this.valMap = valMap;
    }

}
