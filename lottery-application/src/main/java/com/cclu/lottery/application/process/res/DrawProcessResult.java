package com.cclu.lottery.application.process.res;

import com.cclu.lottery.common.Result;
import com.cclu.lottery.domain.strategy.model.vo.DrawAwardVO;

/**
 * @author ChangCheng Lu
 * @date 2023/11/21 14:13
 * @description 抽奖请求
 * @copyright ChangChengLu
 */
public class DrawProcessResult extends Result {

    private DrawAwardVO drawAwardVO;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardVO drawAwardVO) {
        super(code, info);
        this.drawAwardVO = drawAwardVO;
    }

    public DrawAwardVO getDrawAwardVO() {
        return drawAwardVO;
    }

    public void setDrawAwardVO(DrawAwardVO drawAwardVO) {
        this.drawAwardVO = drawAwardVO;
    }

}
