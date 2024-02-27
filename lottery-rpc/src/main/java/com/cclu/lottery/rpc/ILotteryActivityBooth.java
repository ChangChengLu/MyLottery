package com.cclu.lottery.rpc;

import com.cclu.lottery.rpc.req.DrawReq;
import com.cclu.lottery.rpc.req.QuantificationDrawReq;
import com.cclu.lottery.rpc.res.DrawRes;

/**
 * @author ChangCheng Lu
 * @date 2023/10/27 15:18
 * @description 活动展台
 * @copyright ChangChengLu
 */
public interface ILotteryActivityBooth {

    /**
     * 指定活动抽奖
     * @param drawReq 请求参数
     * @return        抽奖结果
     */
    DrawRes doDraw(DrawReq drawReq);

    /**
     * 量化人群抽奖
     * @param quantificationDrawReq 请求参数
     * @return                      抽奖结果
     */
    DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq);

}
