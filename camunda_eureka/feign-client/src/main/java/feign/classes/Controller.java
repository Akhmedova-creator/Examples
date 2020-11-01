package feign.classes;

import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * REST API of Camunda.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/processes")
    @ResponseBody
    String processes() {
        CamundaClient camundaClient = Feign.builder()
                .contract(new SpringMvcContract())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Logger.ErrorLogger())
                .logLevel(Logger.Level.FULL)
                .target(CamundaClient.class, "http://localhost:8560");
        List <CamundaProcess> processes= camundaClient.getProcess();
        return String.format("%s",processes);
    }

    @RequestMapping("/start")
    @ResponseBody
    String start () {
        CamundaClient camundaClient = Feign.builder()
                .contract(new SpringMvcContract())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Logger.ErrorLogger())
                .logLevel(Logger.Level.FULL)
                .target(CamundaClient.class, "http://localhost:8560");
        camundaClient.createCamundaProcess();
        return String.format("Процесс  успешно запущен");
    }
}
