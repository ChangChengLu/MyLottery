package com.cclu.lottery.infrastructure.dao;

import com.cclu.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/10/28 22:27
 * @description
 * @copyright ChangChengLu
 */
@Mapper
public interface IAwardDao {

    /**
     * 查询奖品信息
     * @param awardId 奖品ID
     * @return 奖品PO
     */
    Award queryAwardInfo(String awardId);

    /**
     * 插入奖品配置
     *
     * @param list 奖品配置
     */
    void insertList(List<Award> list);

}
