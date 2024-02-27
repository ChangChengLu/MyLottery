package com.cclu.lottery.domain.award.service.factory;

import com.cclu.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * @author ChangCheng Lu
 * @date 2023/11/3 22:20
 * @description 配送商品简单工厂 + 单例模式，提供获取配送服务
 * @copyright ChangChengLu
 */
@Component
public class DistributionGoodsFactory extends GoodsConfig {

    public IDistributionGoods getDistributionGoodsService(Integer awardType){
        return goodsMap.get(awardType);
    }

}
