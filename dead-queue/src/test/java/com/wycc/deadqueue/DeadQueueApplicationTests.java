package com.wycc.deadqueue;

import com.wycc.deadqueue.config.RabbitMqExchange;
import com.wycc.deadqueue.config.RabbitMqRouting;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class DeadQueueApplicationTests {

	@Autowired
	private IRabbitMqService rabbitMqService;

	Logger logger = LoggerFactory.getLogger(DeadQueueApplicationTests.class);
	@Test
	public void testSendMq(){
		logger.info("生产者发送消息到mq");
		rabbitMqService.send(RabbitMqExchange.MQ_EXCHANGE_TEST, RabbitMqRouting.MQ_ROUTING_TEST,"测试发送消息");
	}

	@Test
	public void testSendDelayMq(){
		logger.info("生产者发送延迟消息到mq");
		rabbitMqService.send(RabbitMqExchange.MQ_EXCHANGE_TEST, RabbitMqRouting.MQ_ROUTING_TEST,"测试发送延时消息60s",60*1000);
	}


}
