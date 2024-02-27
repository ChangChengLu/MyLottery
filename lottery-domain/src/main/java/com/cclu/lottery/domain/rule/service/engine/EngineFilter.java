package com.cclu.lottery.domain.rule.service.engine;

import com.cclu.lottery.domain.rule.model.req.DecisionMatterReq;
import com.cclu.lottery.domain.rule.model.res.EngineResult;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 9:25
 * @description 规则过滤器引擎
 * @copyright ChangChengLu
 */
public interface EngineFilter {

    /**
     * 规则过滤器接口
     *
     * @param matter      规则决策物料
     * @return            规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);

}
