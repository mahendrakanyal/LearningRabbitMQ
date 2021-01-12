package testRabbitMQListener.RabbitMQListener.amqp;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQMessageListener implements MessageListener{

	@Override
	public void onMessage(Message arg0) {
		System.out.println("message = [" + new String(arg0.getBody()) + "]");
		
	}
	
}
