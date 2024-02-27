package com.cclu.lottery.domain.strategy.service.algorithm.impl;

import com.cclu.lottery.domain.strategy.service.algorithm.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/10/29 10:06
 * @description 单体概率算法：【推荐】 单项随机概率抽奖，抽到一个已经排掉的奖品则未中奖
 * @copyright ChangChengLu
 */
@Component("singleRateRandomDrawAlgorithm")
public class SingleRateRandomDrawAlgorithm extends BaseAlgorithm {
    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {
        // 获取策略对应的元组
        String[] rateTuple = rateTupleMap.get(strategyId);
        assert rateTuple != null;

        // 随机索引
        int randomVal = new SecureRandom().nextInt(RATE_TUPLE_LENGTH);
        int idx = hashIdx(randomVal);

        // 返回结果
        String awardId = rateTuple[idx];

        // 如果中奖ID命中奖品排除列表，则返回null
        if (excludeAwardIds.contains(awardId)) {
            return null;
        }

        return awardId;
    }
}
