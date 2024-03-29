package com.wycc.deadqueue.configuration;


import com.wycc.deadqueue.config.RabbitMqBinding;
import com.wycc.deadqueue.config.RabbitMqExchange;
import com.wycc.deadqueue.config.RabbitMqQueue;
import com.wycc.deadqueue.impl.DefaultRabbitMqRegister;
import com.wycc.deadqueue.impl.RabbitMqServiceImpl;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class RabbitMqConfiguration {

    /**
     * 默认采用rabbitMQ
     */
    @Bean
    public RabbitMqServiceImpl rabbitMqService() {
        return new RabbitMqServiceImpl();
    }

    /**
     * 创建 默认的RabbitMQ 注册器
     */
    @Bean
    DefaultRabbitMqRegister rabbitMqRegister(ConnectionFactory connectionFactory) {
        return new DefaultRabbitMqRegister(connectionFactory);
    }

    /**
     * 使用 默认的注册器 注册 Exchange Queue Binding
     */
    @Bean
    Object registerRabbit(DefaultRabbitMqRegister rabbitMqRegister) throws IOException {
        rabbitMqRegister.registerExchange(RabbitMqExchange.values());
        rabbitMqRegister.registerQueue(RabbitMqQueue.values());
        rabbitMqRegister.registerBinding(RabbitMqBinding.values());
        return new Object();
    }
}
