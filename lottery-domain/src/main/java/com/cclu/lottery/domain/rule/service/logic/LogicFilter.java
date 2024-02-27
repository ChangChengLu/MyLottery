package com.cclu.lottery.domain.rule.service.logic;

import com.cclu.lottery.domain.rule.model.req.DecisionMatterReq;
import com.cclu.lottery.domain.rule.model.vo.TreeNodeLineVO;

import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 8:59
 * @description
 * @copyright ChangChengLu
 */
public interface LogicFilter {

    /**
     * 逻辑决策器
     *
     * @param matterValue           决策值
     * @param treeNodeLineInfoList  决策节点
     * @return                      下一个节点ID
     */
    Long filter(String matterValue, List<TreeNodeLineVO> treeNodeLineInfoList);


    /**
     * 获取决策值
     *
     * @param decisionMatterReq 决策物料
     * @return                  决策值
     */
    String matterValue(DecisionMatterReq decisionMatterReq);

}
