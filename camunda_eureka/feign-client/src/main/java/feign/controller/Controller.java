package feign.controller;

import feign.controller.repo.ProcessesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * REST API of Camunda.
 *
 */

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private ProcessesRepo processesRepo;
    private final CamundaClient camundaClient;

    public Controller(CamundaClient camundaClient) {
        this.camundaClient = camundaClient;
    }

    @RequestMapping("/processes")
    @ResponseBody
    String processes() {
        List<CamundaProcess> processes = camundaClient.getProcess();
        for (CamundaProcess process:
             processes) {
            processesRepo.save(process);
        }
        return String.format("%s", processes);
    }

    @RequestMapping("/start")
    @ResponseBody
    String start() {
        CamundaProcess camundaProcess = new CamundaProcess();
        String process = camundaClient.createProcess(camundaProcess).getId();
        return String.format(" Запуск процесса с id %s",process);
    }
}
