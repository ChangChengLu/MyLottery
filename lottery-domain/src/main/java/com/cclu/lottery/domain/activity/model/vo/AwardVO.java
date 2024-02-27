package com.cclu.lottery.domain.activity.model.vo;

import lombok.Data;

/**
 * @author ChangCheng Lu
 * @date 2023/11/5 10:46
 * @description 奖品信息配置
 * @copyright ChangChengLu
 */
@Data
public class AwardVO {

    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 奖品类型：
     * 1. 文字描述
     * 2. 兑换码
     * 3. 优惠卷
     * 4. 实物奖品
     */
    private Integer awardType;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 奖品内容「描述、奖品码、sku」
     */
    private String awardContent;

}
