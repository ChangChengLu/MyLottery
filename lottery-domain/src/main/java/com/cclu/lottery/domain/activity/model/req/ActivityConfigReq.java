package com.cclu.lottery.domain.activity.model.req;

import com.cclu.lottery.domain.activity.model.aggregates.ActivityConfigRich;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ChangCheng Lu
 * @date 2023/11/5 14:18
 * @description 活动配置请求对象
 * @copyright ChangChengLu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityConfigReq {

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动配置请求信息
     */
    private ActivityConfigRich activityConfigRich;

}
