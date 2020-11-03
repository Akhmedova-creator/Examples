package feign.classes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * HTPP request.
 */
@FeignClient("client")
public interface CamundaClient {

   @RequestMapping(method = RequestMethod.GET, value = "/rest/process-instance")
   List<CamundaProcess>  getProcess();

   @RequestMapping(method = RequestMethod.POST, value = "/rest/process-definition/key/Process/tenant-id/process/start")
   CamundaProcess createProcess(CamundaProcess process);
}
