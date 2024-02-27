package com.cclu.lottery.common;

import lombok.Getter;

/**
 * @author ChangCheng Lu
 * @date 2023/10/26 22:47
 * @description 枚举常量信息定义
 * @copyright ChangChengLu
 */
public class Constants {

    @Getter
    public enum ResponseCode {

        /**
         * SUCCESS, UN_ERROR, ILLEGAL_PARAMETER, INDEX_DUP
         */
        SUCCESS("0000", "成功"),
        UN_ERROR("0001", "未知失败"),
        ILLEGAL_PARAMETER("0002", "非法参数"),
        INDEX_DUP("0003", "主键冲突"),
        NO_UPDATE("0004","SQL操作无更新"),
        LOSING_DRAW("D001", "未中奖"),
        RULE_ERR("D002", "量化人群规则执行失败");

        private final String code;

        private final String info;

        ResponseCode(String code, String info) {
            this.code = code;
            this.info = info;
        }
    }

    /**
     * 全局属性
     */
    public static final class Global {

        /**
         * 空节点值(对应规则节点子叶值)
         */
        public static final Long TREE_NULL_NODE = 0L;

    }

    /**
     * 决策树节点
     */
    public static final class NodeType {

        /**
         * 树茎
         */
        public static final Integer STEM = 1;

        /**
         * 果实
         */
        public static final Integer FRUIT = 2;

    }

    /**
     * 规则限定类型
     */
    public static final class RuleLimitType {

        /**
         * 等于
         */
        public static final int EQUAL = 1;

        /**
         * 大于
         */
        public static final int GT = 2;

        /**
         * 小于
         */
        public static final int LT = 3;

        /**
         * 大于&等于
         */
        public static final int GE = 4;

        /**
         * 小于&等于
         */
        public static final int LE = 5;

        /**
         * 枚举
         */
        public static final int ENUM = 6;

    }

    /**
     * 活动状态：1编辑、2提审、3撤审、4通过、5运行(审核通过后worker扫描状态)、6拒绝、7关闭、8开启
     */
    @Getter
    public enum ActivityState {

        /** 1：编辑 */
        EDIT(1, "编辑"),
        /** 2：提审 */
        ARRAIGNMENT(2, "提审"),
        /** 3：撤审 */
        REVOKE(3, "撤审"),
        /** 4：通过 */
        PASS(4, "通过"),
        /** 5：运行(活动中) */
        DOING(5, "运行(活动中)"),
        /** 6：拒绝 */
        REFUSE(6, "拒绝"),
        /** 7：关闭 */
        CLOSE(7, "关闭"),
        /** 8：开启 */
        OPEN(8, "开启");

        private final Integer code;

        private final String info;

        ActivityState(Integer code, String info) {
            this.code = code;
            this.info = info;
        }
    }

    /**
     * 抽奖策略模式：总体概率、单项概率
     * 场景：两种抽奖算法描述，场景A20%、B30%、C50%
     * 单项概率：如果A奖品抽空后，B和C保持目前中奖概率，用户抽奖扔有20%中为A，因A库存抽空则结果展示为未中奖。为了运营成本，通常这种情况的使用的比较多
     * 总体概率：如果A奖品抽空后，B和C奖品的概率按照 3:5 均分，相当于B奖品中奖概率由 0.3 升为 0.375
     */
    @Getter
    public enum StrategyMode {

        /**
         * 单项概率：如果A奖品抽空后，B和C保持目前中奖概率，用户抽奖扔有20%中为A，因A库存抽空则结果展示为未中奖。为了运营成本，通常这种情况的使用的比较多
         */
        SINGLE(1, "单项概率"),

        /**
         * 总体概率：如果A奖品抽空后，B和C奖品的概率按照 3:5 均分，相当于B奖品中奖概率由 0.3 升为 0.375
         */
        ENTIRETY(2, "总体概率");

        private final Integer code;

        private final String info;

        StrategyMode(Integer code, String info) {
            this.code = code;
            this.info = info;
        }
    }

    /**
     * 中奖状态：0未中奖、1已中奖、2兜底奖
     */
    @Getter
    public enum DrawState {
        /**
         * 未中奖
         */
        FAIL(0, "未中奖"),

        /**
         * 已中奖
         */
        SUCCESS(1, "已中奖"),

        /**
         * 兜底奖
         */
        Cover(2, "兜底奖");

        private final Integer code;

        private final String info;

        DrawState(Integer code, String info) {
            this.code = code;
            this.info = info;
        }
    }

    /**
     * 发奖状态：0等待发奖、1发奖成功、2发奖失败
     */
    @Getter
    public enum AwardState {

        /**
         * 等待发奖
         */
        WAIT(0, "等待发奖"),

        /**
         * 发奖成功
         */
        SUCCESS(1, "发奖成功"),

        /**
         * 发奖失败
         */
        FAILURE(2, "发奖失败");

        private final Integer code;

        private final String info;

        AwardState(Integer code, String info) {
            this.code = code;
            this.info = info;
        }
    }

    /**
     * 奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）
     */
    @Getter
    public enum AwardType {
        /**
         * 文字描述
         */
        DESC(1, "文字描述"),
        /**
         * 兑换码
         */
        RedeemCodeGoods(2, "兑换码"),
        /**
         * 优惠券
         */
        CouponGoods(3, "优惠券"),
        /**
         * 实物奖品
         */
        PhysicalGoods(4, "实物奖品");

        private final Integer code;

        private final String info;

        AwardType(Integer code, String info) {
            this.code = code;
            this.info = info;
        }
    }

    /**
     * Ids 生成策略枚举
     */
    public enum Ids {
        /** 雪花算法 */
        SnowFlake,
        /** 日期算法 */
        ShortCode,
        /** 随机算法 */
        RandomNumeric
    }

    /**
     * 活动单使用状态 0未使用、1已使用
     */
    @Getter
    public enum TaskState {

        /**
         * 未使用
         */
        NO_USED(0, "未使用"),
        /**
         * 已使用
         */
        USED(1, "已使用");

        private final Integer code;

        private final String info;

        TaskState(Integer code, String info) {
            this.code = code;
            this.info = info;
        }
    }

    /**
     * 发奖状态 0初始、1完成、2失败
     */
    @Getter
    public enum GrantState {
        /**
         * 初始
         */
        INIT(0, "初始"),
        /**
         * 完成
         */
        COMPLETE(1, "完成"),
        /**
         * 失败
         */
        FAIL(2, "失败");

        private final Integer code;

        private final String info;

        GrantState(Integer code, String info) {
            this.code = code;
            this.info = info;
        }
    }

    /**
     * 消息发送状态（0未发送、1发送成功、2发送失败）
     */
    @Getter
    public enum MQState {
        /**
         * 初始
         */
        INIT(0, "初始"),
        /**
         * 完成
         */
        COMPLETE(1, "完成"),
        /**
         * 失败
         */
        FAIL(2, "失败");

        private final Integer code;

        private final String info;

        MQState(Integer code, String info) {
            this.code = code;
            this.info = info;
        }
    }
}