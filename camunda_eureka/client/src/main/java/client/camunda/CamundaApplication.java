package client.camunda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController


/**
 * Feign и Eureka клиент.
 */
public class CamundaApplication {

  public static void main(String[] args) {
    SpringApplication.run(CamundaApplication.class);
  }
}