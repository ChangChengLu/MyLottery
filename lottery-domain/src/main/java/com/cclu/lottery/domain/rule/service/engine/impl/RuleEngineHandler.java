package com.cclu.lottery.domain.rule.service.engine.impl;

import com.cclu.lottery.domain.rule.model.aggregates.TreeRuleRich;
import com.cclu.lottery.domain.rule.model.req.DecisionMatterReq;
import com.cclu.lottery.domain.rule.model.res.EngineResult;
import com.cclu.lottery.domain.rule.model.vo.TreeNodeVO;
import com.cclu.lottery.domain.rule.repository.IRuleRepository;
import com.cclu.lottery.domain.rule.service.engine.EngineBase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 10:10
 * @description
 * @copyright ChangChengLu
 */
@Service("ruleEngineHandle")
public class RuleEngineHandler extends EngineBase {

    @Resource
    private IRuleRepository ruleRepository;

    @Override
    public EngineResult process(DecisionMatterReq matter) {
        // 决策规则树
        TreeRuleRich treeRuleRich = ruleRepository.queryRuleRich(matter.getTreeId());
        if (null == treeRuleRich) {
            throw new RuntimeException("Tree Rule is null!");
        }

        // 决策节点
        TreeNodeVO treeNodeInfo = engineDecisionMaker(treeRuleRich, matter);

        // 决策结果
        return new EngineResult(matter.getUserId(), treeNodeInfo.getTreeId(), treeNodeInfo.getTreeNodeId(), treeNodeInfo.getNodeValue());
    }
}
