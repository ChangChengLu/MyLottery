package com.cclu.lottery.rpc.res;

import com.cclu.lottery.common.Result;
import com.cclu.lottery.rpc.dto.ActivityDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ChangCheng Lu
 * @date 2023/10/27 15:20
 * @description 查询活动结果
 * @copyright ChangChengLu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityRes {

    private Result result;

    private ActivityDTO activity;

    public ActivityRes(Result result) {
        this(result, null);
    }

}
