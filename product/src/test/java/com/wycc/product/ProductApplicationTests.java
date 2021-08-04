package com.wycc.product;

import com.wycc.product.config.RabbitmqConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Test
	public void Producer_topics_springbootTest(){
		//使用rabbitTemplate发送消息
		String message = "send email message to user";
		/**
		 * 参数：
		 * 1、交换机名称
		 * 2、routingKey
		 * 3、消息内容
		 */
		rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_TOPICS_INFORM, "inform.email", message);

	}

}
