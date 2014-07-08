package com.cashway.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by mmzz on 2014/6/24.
 */
@Entity
@Table(name = "AGENTS_MEM")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "SQ_AGENTS_MEM")
public class ArtificialAgentsMem extends BaseEntity {

    public interface Status {
        String BUSY = "1";
        String FREE = "0";
        String OFFLINE = "2";
    }

    @Column(name = "AGENTS_ID", nullable = false)
    private int agentsId;

    @Column(name = "STATUS", nullable = false)
    private String status;

    @Column(name = "SERVICE_TYPE", nullable = false)
    private String serviceType;

    @Column(name = "AGENTS_TYPE", nullable = false)
    private String agentsType;

    @Column(name = "WAIT_TIME", nullable = false)
    private Long waitTime;

    @Column(name = "CREATED_DATE", nullable = false)
    private Date createdDate;

    public int getAgentsId() {
        return agentsId;
    }

    public void setAgentsId(int agentsId) {
        this.agentsId = agentsId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getAgentsType() {
        return agentsType;
    }

    public void setAgentsType(String agentsType) {
        this.agentsType = agentsType;
    }

    public Long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Long waitTime) {
        this.waitTime = waitTime;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
