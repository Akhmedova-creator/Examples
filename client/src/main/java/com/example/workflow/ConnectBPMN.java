package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

/**
 * Класс для подключене к бизнес процессу BPMN.
 */
@Component
public class ConnectBPMN implements JavaDelegate {
    /**
     *
     * @param delegateExecution для установки параметров значений в диаграмме.
     * @throws Exception при возникновении ошибки во время загрузки дмаграммы.
     */
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        int count=100;
        String status="undefined";
        delegateExecution.setVariable("count",count);
        delegateExecution.setVariable("status",status);
    }
}
