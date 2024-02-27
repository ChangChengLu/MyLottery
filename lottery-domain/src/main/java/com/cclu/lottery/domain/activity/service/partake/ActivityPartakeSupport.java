package com.cclu.lottery.domain.activity.service.partake;

import com.cclu.lottery.domain.activity.model.req.PartakeReq;
import com.cclu.lottery.domain.activity.model.vo.ActivityBillVO;
import com.cclu.lottery.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

/**
 * @author ChangCheng Lu
 * @date 2023/11/19 16:29
 * @description 活动领取操作，一些通用的数据服务
 * @copyright ChangChengLu
 */
public class ActivityPartakeSupport {

    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req) {
        return activityRepository.queryActivityBill(req);
    }

}
