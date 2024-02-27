package com.cclu.lottery.domain.activity.model.res;

import com.cclu.lottery.common.Result;

/**
 * @author ChangCheng Lu
 * @date 2023/11/19 16:25
 * @description 活动参与返回结果
 * @copyright ChangChengLu
 */
public class PartakeResult extends Result {

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 活动领取ID
     */
    private Long takeId;

    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Long getTakeId() {
        return takeId;
    }

    public void setTakeId(Long takeId) {
        this.takeId = takeId;
    }
}
