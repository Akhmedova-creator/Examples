package feign.classes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * HTPP request.
 */
public interface CamundaClient {
   @RequestMapping(method = RequestMethod.GET, value = "/rest/process-instance")
   List<CamundaProcess>  getProcess();

   @RequestMapping(method = RequestMethod.POST, value = "/rest/process-instance/key/process/start")
   CamundaProcess createCamundaProcess();
}
