package com.cclu.lottery.domain.rule.repository;

import com.cclu.lottery.domain.rule.model.aggregates.TreeRuleRich;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 8:57
 * @description 规则信息仓储服务接口
 * @copyright ChangChengLu
 */
public interface IRuleRepository {

    /**
     * 查询规则树配置
     * @param treeId 决策树ID
     * @return       决策树配置
     */
    TreeRuleRich queryRuleRich(Long treeId);

}
