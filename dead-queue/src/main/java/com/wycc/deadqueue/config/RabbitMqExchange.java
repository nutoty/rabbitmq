package com.wycc.deadqueue.config;

import com.wycc.deadqueue.IRabbitMqExchange;

/**
 * RabbitMq Exchange(交换机)定义
 * */
public enum RabbitMqExchange implements IRabbitMqExchange {

    MQ_EXCHANGE_TEST("mq.exchange.test") ;

    private String exchangeName;


    RabbitMqExchange(String exchangeName){
        this.exchangeName = exchangeName;
    }

    @Override
    public String exchangeName() {
        return this.exchangeName;
    }
}
