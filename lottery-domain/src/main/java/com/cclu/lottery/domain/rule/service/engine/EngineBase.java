package com.cclu.lottery.domain.rule.service.engine;

import com.cclu.lottery.common.Constants;
import com.cclu.lottery.domain.rule.model.aggregates.TreeRuleRich;
import com.cclu.lottery.domain.rule.model.req.DecisionMatterReq;
import com.cclu.lottery.domain.rule.model.res.EngineResult;
import com.cclu.lottery.domain.rule.model.vo.TreeNodeVO;
import com.cclu.lottery.domain.rule.model.vo.TreeRootVO;
import com.cclu.lottery.domain.rule.service.logic.LogicFilter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 9:29
 * @description 规则引擎基础类
 * @copyright ChangChengLu
 */
@Slf4j
public abstract class EngineBase extends EngineConfig implements EngineFilter {

    @Override
    public EngineResult process(DecisionMatterReq matter) {
        throw new RuntimeException("未实现规则引擎服务");
    }

    protected TreeNodeVO engineDecisionMaker(TreeRuleRich treeRuleRich, DecisionMatterReq matter) {
        TreeRootVO treeRoot = treeRuleRich.getTreeRoot();
        Map<Long, TreeNodeVO> treeNodeMap = treeRuleRich.getTreeNodeMap();

        // 规则树根ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNodeVO treeNodeInfo = treeNodeMap.get(rootNodeId);

        // 节点类型[NodeType]: 1.子叶 2.果实
        while (Constants.NodeType.STEM.equals(treeNodeInfo.getNodeType())) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(matter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLineInfoList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            log.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), matter.getUserId(), matter.getTreeId(), treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }

        return treeNodeInfo;
    }

}
