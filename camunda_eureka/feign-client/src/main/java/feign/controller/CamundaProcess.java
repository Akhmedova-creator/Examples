package feign.controller;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.Id;

@Data
/**
 * Element processes.
 */
@Entity
@Table(name = "process")
public class CamundaProcess {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    String id;
    String definitionId;
    String businessKey;
    String caseInstanceId;
    Boolean ended;
    Boolean suspended;
    String tenantId;
}
