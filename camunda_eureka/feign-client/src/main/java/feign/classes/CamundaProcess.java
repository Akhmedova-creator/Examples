package feign.classes;

import lombok.Data;

@Data
/**
 * Element processes.
 */
public class CamundaProcess {
    public String process;
    String id;
    String definitionId;
    String businessKey;
    String caseInstanceId;
    Boolean ended;
    Boolean suspended;
    String tenantId;


}
