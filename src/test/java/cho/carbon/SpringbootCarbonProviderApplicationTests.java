package cho.carbon;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootCarbonProviderApplicationTests {

	@Autowired
	AmqpAdmin amqpAdmin;
	
	@Test
	public void createExchange() {
		String exchange = "carbon.fg";
		amqpAdmin.declareExchange(new DirectExchange(exchange));
		
		String queue = "carbonqueu";
		amqpAdmin.declareQueue(new Queue(queue, true));
		
		String routingKey = "carbonqueukey";
		amqpAdmin.declareBinding(new Binding(queue, Binding.DestinationType.QUEUE, exchange, routingKey, null));
	}
	
	
	@Test
	void contextLoads() {
	}

}
