package feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
/**
 * start Feig-Client.
 */
public class FeignApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FeignApplication.class, args);
	}
}
