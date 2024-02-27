package com.cclu.lottery.rpc.res;

import com.cclu.lottery.common.Result;
import com.cclu.lottery.rpc.dto.AwardDTO;

import java.io.Serializable;

/**
 * @author ChangCheng Lu
 * @date 2023/11/25 14:34
 * @description 抽奖返回结果
 * @copyright ChangChengLu
 */
public class DrawRes extends Result implements Serializable {

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }
}
