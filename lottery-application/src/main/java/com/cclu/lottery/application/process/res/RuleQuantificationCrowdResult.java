package com.cclu.lottery.application.process.res;

import com.cclu.lottery.common.Result;

/**
 * @author ChangCheng Lu
 * @date 2023/11/25 14:45
 * @description 规则量化引擎执行结果(返回用户可活动ID)
 * @copyright ChangChengLu
 */
public class RuleQuantificationCrowdResult extends Result {

    /**
     * 活动ID
     */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
