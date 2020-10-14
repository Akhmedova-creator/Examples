package com.example.workflow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients

/**
 * Feign и Eureka клиент.
 */
public class ApplicationFeignIm implements  FeignCl{

  public static void main(String[] args) {
    SpringApplication.run(ApplicationFeignIm.class);
  }
    /**
     * Запуск процесса.
     * @return гиперссылка для запуска процесса.
     */
   @Override
    public String startProcess() {
       return "<a href='http://desktop-bmriamt:8080" +
               "/app/tasklist/default/#/?searchQuery" +
               "=%5B%5D&processStart=Process'>" +
               "Start Bisnes Process </a>";
    }
}