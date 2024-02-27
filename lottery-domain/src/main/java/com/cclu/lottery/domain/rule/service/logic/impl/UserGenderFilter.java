package com.cclu.lottery.domain.rule.service.logic.impl;

import com.cclu.lottery.domain.rule.model.req.DecisionMatterReq;
import com.cclu.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 9:24
 * @description
 * @copyright ChangChengLu
 */
@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }

}
