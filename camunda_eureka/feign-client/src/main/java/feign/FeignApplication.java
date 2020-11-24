package feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Configuration
@EnableAutoConfiguration
/**
 * start Feig-Client.
 */
public class FeignApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FeignApplication.class, args);
	}
}
