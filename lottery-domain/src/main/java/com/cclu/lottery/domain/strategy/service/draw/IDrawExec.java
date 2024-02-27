package com.cclu.lottery.domain.strategy.service.draw;

import com.cclu.lottery.domain.strategy.model.req.DrawReq;
import com.cclu.lottery.domain.strategy.model.res.DrawResult;

/**
 * @author ChangCheng Lu
 * @date 2023/10/28 23:14
 * @description 抽奖
 * @copyright ChangChengLu
 */
public interface IDrawExec {

    /**
     * 抽奖活动
     * @param req 抽奖请求
     * @return 抽奖结果
     */
    DrawResult doDrawExec(DrawReq req);

}
