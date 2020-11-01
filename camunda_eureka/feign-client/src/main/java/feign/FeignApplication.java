package feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * start Feig-Client.
 */
public class FeignApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FeignApplication.class, args);
	}
}
