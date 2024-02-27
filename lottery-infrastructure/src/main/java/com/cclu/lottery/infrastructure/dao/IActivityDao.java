package com.cclu.lottery.infrastructure.dao;

import com.cclu.lottery.domain.activity.model.vo.AlterStateVO;
import com.cclu.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/10/27 15:08
 * @description 活动数据持久化操作
 * @copyright ChangChengLu
 */
@Mapper
public interface IActivityDao {

    /**
     * 插入活动数据
     * @param req 活动基础信息
     */
    void insert(Activity req);

    /**
     * 通过ID查询活动
     * @param activityId 活动ID
     * @return 活动基础信息
     */
    Activity queryActivityById(Long activityId);

    /**
     * 变更活动状态
     *
     * @param alterStateVO  [activityId、beforeState、afterState]
     * @return 更新数量
     */
    int alterState(AlterStateVO alterStateVO);

    /**
     * 扣减活动库存
     * @param activityId 活动ID
     * @return 更新数量
     */
    int subtractionActivityStock(Long activityId);

    /**
     * 扫描待处理的活动列表，状态为：通过、活动中
     *
     * @param id ID
     * @return 待处理的活动集合
     */
    List<Activity> scanToDoActivityList(Long id);

}
