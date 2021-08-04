package com.wycc.deadqueue;

public interface IRabbitMqRouting {
    /**
     * rabbitmq路由key
     * */
    String routingKey();
}
