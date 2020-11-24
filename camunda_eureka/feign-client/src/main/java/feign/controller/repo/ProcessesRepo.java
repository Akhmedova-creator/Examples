package feign.controller.repo;

import feign.controller.CamundaProcess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessesRepo extends CrudRepository <CamundaProcess,Long> {

}
