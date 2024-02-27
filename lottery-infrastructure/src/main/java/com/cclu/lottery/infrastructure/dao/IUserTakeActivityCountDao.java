package com.cclu.lottery.infrastructure.dao;

import com.cclu.lottery.infrastructure.po.UserTakeActivityCount;
import com.cclu.middleware.db.router.annotation.DBRouter;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChangCheng Lu
 * @date 2023/11/19 17:33
 * @description 用户参与活动次数表DAO
 * @copyright ChangChengLu
 */
@Mapper
public interface IUserTakeActivityCountDao {

    /**
     * 查询用户领取次数信息
     * @param userTakeActivityCountReq 请求入参【活动号、用户ID】
     * @return 领取结果
     */
    @DBRouter
    UserTakeActivityCount queryUserTakeActivityCount(UserTakeActivityCount userTakeActivityCountReq);

    /**
     * 插入领取次数信息
     * @param userTakeActivityCount 请求入参
     */
    void insert(UserTakeActivityCount userTakeActivityCount);

    /**
     * 更新领取次数信息
     * @param userTakeActivityCount 请求入参
     * @return 更新数量
     */
    int updateLeftCount(UserTakeActivityCount userTakeActivityCount);

}
