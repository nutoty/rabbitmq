package com.wycc.deadqueue.config;

import com.wycc.deadqueue.IRabbitMqRouting;

/**
 * RabbitMq routing（路由定义）
 * */
public enum RabbitMqRouting implements IRabbitMqRouting {
    MQ_ROUTING_TEST("mq.routing.test");

    private String routingKey;

    @Override
    public String routingKey() {
        return this.routingKey;
    }

    RabbitMqRouting(String routingKey){
        this.routingKey = routingKey;
    }
}

