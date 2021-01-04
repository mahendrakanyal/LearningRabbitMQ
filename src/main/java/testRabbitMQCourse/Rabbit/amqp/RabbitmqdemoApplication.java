package testRabbitMQCourse.Rabbit.amqp;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqdemoApplication implements CommandLineRunner{
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public static void main(String[] args) throws InterruptedException {
	    SpringApplication.run(RabbitmqdemoApplication.class, args).close();
	  }

	@Override
	public void run(String... arg0) throws Exception {
		
		rabbitTemplate.convertAndSend("hello from our first message!");
		
	}
}
