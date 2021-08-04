package com.wycc.deadqueue.config;

import com.wycc.deadqueue.IRabbitMqQueue;

public enum RabbitMqQueue implements IRabbitMqQueue {
    MQ_QUEUE_TEST("mq.queue.test");

    private String queueName;

    @Override
    public String queueName() {
        return this.queueName;
    }

    RabbitMqQueue(String queueName){
        this.queueName = queueName;
    }

}

