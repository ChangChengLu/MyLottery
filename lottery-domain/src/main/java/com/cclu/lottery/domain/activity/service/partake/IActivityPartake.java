package com.cclu.lottery.domain.activity.service.partake;

import com.cclu.lottery.common.Result;
import com.cclu.lottery.domain.activity.model.req.PartakeReq;
import com.cclu.lottery.domain.activity.model.res.PartakeResult;
import com.cclu.lottery.domain.activity.model.vo.DrawOrderVO;

/**
 * @author ChangCheng Lu
 * @date 2023/11/5 16:08
 * @description 抽奖活动参与接口
 * @copyright ChangChengLu
 */
public interface IActivityPartake {

    /**
     * 参与活动
     * @param req 参与活动请求
     * @return 领取结果
     */
    PartakeResult doPartake(PartakeReq req);

    /**
     * 保存奖品单
     * @param drawOrder 奖品单
     * @return          保存结果
     */
    Result recordDrawOrder(DrawOrderVO drawOrder);

    /**
     * 更新发货单MQ状态
     *  @param uId      用户ID
     * @param orderId   订单ID
     * @param mqState   MQ 发送状态
     */
    void updateInvoiceMqState(String uId, Long orderId, Integer mqState);

}
