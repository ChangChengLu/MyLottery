package com.cclu.lottery.domain.rule.model.aggregates;

import com.cclu.lottery.domain.rule.model.vo.TreeNodeVO;
import com.cclu.lottery.domain.rule.model.vo.TreeRootVO;
import lombok.Data;

import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 8:48
 * @description 规则树聚合
 * @copyright ChangChengLu
 */
@Data
public class TreeRuleRich {

    /**
     * 树根信息
     */
    private TreeRootVO treeRoot;

    /**
     * 树节点ID -> 树节点信息
     */
    private Map<Long, TreeNodeVO> treeNodeMap;

}
