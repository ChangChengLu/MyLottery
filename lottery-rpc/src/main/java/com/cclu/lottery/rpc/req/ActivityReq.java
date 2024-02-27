package com.cclu.lottery.rpc.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ChangCheng Lu
 * @date 2023/10/27 15:20
 * @description 查询活动请求
 * @copyright ChangChengLu
 */
@Data
public class ActivityReq implements Serializable {

    private Long activityId;

}
