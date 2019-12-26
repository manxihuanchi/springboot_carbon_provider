package cho.carbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cho.carbon.cfg.annotation.EnableFGServer;

@EnableFGServer
@SpringBootApplication
public class SpringbootCarbonProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCarbonProviderApplication.class, args);
	}

}
