package com.cclu.lottery.application.mq.producer;

import com.alibaba.fastjson.JSON;
import com.cclu.lottery.domain.activity.model.vo.InvoiceVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import javax.annotation.Resource;

/**
 * @author ChangCheng Lu
 * @date 2023/11/30 14:37
 * @description MQ 消息发送服务
 * @copyright ChangChengLu
 */
@Component
@Slf4j
public class KafkaProducer {

    /**
     * MQ主题：中奖发货单
     * <p>
     * 启动zk：bin/zookeeper-server-start.sh -daemon config/zookeeper.properties
     * 启动kafka：bin/kafka-server-start.sh -daemon config/server.properties
     * 创建topic：bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic lottery_invoice
     */
    public static final String TOPIC_INVOICE = "lottery_invoice";
    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;

    /**
     * 发送中奖物品发货单消息
     *
     * @param invoice 发货单
     */
    public ListenableFuture<SendResult<String, Object>> sendLotteryInvoice(InvoiceVO invoice) {
        String objJson = JSON.toJSONString(invoice);
        log.info("发送MQ消息 topic：{} bizId：{} message：{}", TOPIC_INVOICE, invoice.getUId(), objJson);
        return kafkaTemplate.send(TOPIC_INVOICE, objJson);
    }

}
