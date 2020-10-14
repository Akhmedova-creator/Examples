package com.example.workflow;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Интерфейс для работы с Feign клиентом.
 */
@FeignClient(url="http://desktop-bmriamt:8080/",value="client")
public interface  FeignCl {
    /**
     * Запуск процесса.
     */
    @RequestMapping(value = "/")
    String startProcess();
}