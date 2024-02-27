package com.cclu.lottery.domain.award.service.factory;

import com.cclu.lottery.common.Constants;
import com.cclu.lottery.domain.award.service.goods.IDistributionGoods;
import com.cclu.lottery.domain.award.service.goods.impl.CouponGoods;
import com.cclu.lottery.domain.award.service.goods.impl.DescGoods;
import com.cclu.lottery.domain.award.service.goods.impl.PhysicalGoods;
import com.cclu.lottery.domain.award.service.goods.impl.RedeemCodeGoods;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ChangCheng Lu
 * @date 2023/11/3 22:19
 * @description 各类发奖奖品配置类
 * @copyright ChangChengLu
 */
public class GoodsConfig {

    /**
     * 奖品发放策略组
     */
    protected static Map<Integer, IDistributionGoods> goodsMap = new ConcurrentHashMap<>();

    @Resource
    private DescGoods descGoods;

    @Resource
    private RedeemCodeGoods redeemCodeGoods;

    @Resource
    private CouponGoods couponGoods;

    @Resource
    private PhysicalGoods physicalGoods;

    @PostConstruct
    public void init() {
        goodsMap.put(Constants.AwardType.DESC.getCode(), descGoods);
        goodsMap.put(Constants.AwardType.RedeemCodeGoods.getCode(), redeemCodeGoods);
        goodsMap.put(Constants.AwardType.CouponGoods.getCode(), couponGoods);
        goodsMap.put(Constants.AwardType.PhysicalGoods.getCode(), physicalGoods);
    }

}
