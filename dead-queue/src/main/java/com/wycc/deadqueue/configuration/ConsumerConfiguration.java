package com.wycc.deadqueue.configuration;

import com.wycc.deadqueue.config.RabbitMqQueue;
import com.wycc.deadqueue.consumer.TestConsumer;
import com.wycc.deadqueue.impl.DefaultRabbitMqRegister;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfiguration {
    /**
     * 使用 默认的注册器 注册 消息队列的消费者(消息处理器)
     */
    @Bean
    Object listenerRabbit(DefaultRabbitMqRegister rabbitMqRegister) {
        rabbitMqRegister.listenerQueue(testConsumer(), RabbitMqQueue.MQ_QUEUE_TEST);
        return null;
    }
    @Bean
    TestConsumer testConsumer(){
        return new TestConsumer();
    }


}
