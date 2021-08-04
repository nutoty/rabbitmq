package com.wycc.deadqueue;
/**
 * 消息监听(消费)者
 * */
public interface IRabbitMqListener {
    /**
     * 处理rabbitMq的消息
     * */
    boolean handleMessage(Object obj);
}
