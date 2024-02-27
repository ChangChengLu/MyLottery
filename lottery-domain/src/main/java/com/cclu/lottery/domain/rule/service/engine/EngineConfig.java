package com.cclu.lottery.domain.rule.service.engine;

import com.cclu.lottery.domain.rule.service.logic.LogicFilter;
import com.cclu.lottery.domain.rule.service.logic.impl.UserAgeFilter;
import com.cclu.lottery.domain.rule.service.logic.impl.UserGenderFilter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ChangCheng Lu
 * @date 2023/11/23 9:26
 * @description 规则引擎配置类
 * @copyright ChangChengLu
 */
public class EngineConfig {

    protected static Map<String, LogicFilter> logicFilterMap = new ConcurrentHashMap<>();

    @Resource
    private UserAgeFilter userAgeFilter;

    @Resource
    private UserGenderFilter userGenderFilter;

    @PostConstruct
    public void init() {
        logicFilterMap.put("userAge", userAgeFilter);
        logicFilterMap.put("userGender", userGenderFilter);
    }

}
