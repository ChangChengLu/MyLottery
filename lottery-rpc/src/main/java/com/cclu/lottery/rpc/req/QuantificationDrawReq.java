package com.cclu.lottery.rpc.req;

import lombok.Data;

import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/11/25 14:36
 * @description 量化人群抽奖请求参数
 * @copyright ChangChengLu
 */
@Data
public class QuantificationDrawReq {

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 决策值
     */
    private Map<String, Object> valMap;

}
