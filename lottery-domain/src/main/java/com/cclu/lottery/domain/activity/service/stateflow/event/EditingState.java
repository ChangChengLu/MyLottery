package com.cclu.lottery.domain.activity.service.stateflow.event;

import com.cclu.lottery.common.Constants;
import com.cclu.lottery.common.Result;
import com.cclu.lottery.domain.activity.service.stateflow.AbstractState;
import org.springframework.stereotype.Component;

/**
 * @author ChangCheng Lu
 * @date 2023/11/5 16:23
 * @description 编辑状态
 * @copyright ChangChengLu
 */
@Component
public class EditingState extends AbstractState {

    @Override
    public Result arraignment(Long activityId, Enum<Constants.ActivityState> currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, Constants.ActivityState.ARRAIGNMENT);
        return isSuccess ? Result.buildResult(Constants.ResponseCode.SUCCESS, "活动提审成功") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result checkPass(Long activityId, Enum<Constants.ActivityState> currentState) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "编辑中不可审核通过");
    }

    @Override
    public Result checkRefuse(Long activityId, Enum<Constants.ActivityState> currentState) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "编辑中不可审核拒绝");
    }

    @Override
    public Result checkRevoke(Long activityId, Enum<Constants.ActivityState> currentState) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "编辑中不可撤销审核");
    }

    @Override
    public Result close(Long activityId, Enum<Constants.ActivityState> currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, Constants.ActivityState.CLOSE);
        return isSuccess ? Result.buildResult(Constants.ResponseCode.SUCCESS, "活动关闭成功") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result open(Long activityId, Enum<Constants.ActivityState> currentState) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "非关闭活动不可开启");
    }

    @Override
    public Result doing(Long activityId, Enum<Constants.ActivityState> currentState) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "编辑中活动不可执行活动中变更");
    }

}
