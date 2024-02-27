package com.cclu.lottery.domain.activity.model.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author ChangCheng Lu
 * @date 2023/11/19 16:22
 * @description 参与活动请求
 * @copyright ChangChengLu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartakeReq {

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动领取时间
     */
    private Date partakeDate;

    public PartakeReq(String uId, Long activityId) {
        this(uId, activityId, new Date());
    }

}
