package com.cclu.lottery.domain.rule.model.res;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 8:55
 * @description 搜素引擎返回结果
 * @copyright ChangChengLu
 */
@Data
@NoArgsConstructor
public class EngineResult {

    /**
     * 执行结果
     */
    private boolean isSuccess;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 果实节点ID
     */
    private Long nodeId;

    /**
     * 果实节点值
     */
    private String nodeValue;

    public EngineResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }

}
