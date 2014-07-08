package com.cashway.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mmzz on 2014/6/25.
 */
@Entity
@Table(name = "CUST_MEM_HISTORY")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "SQ_CUST_MEM_HISTORY")
public class CustomerMemHistory extends BaseEntity {

    public interface ProcessResult {
        String SUCCESS = "0";
        String ABANDON = "1";
        String ABORT = "2";
    }

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PERSON_ID", nullable = false)
    private String personId;

    @Column(name = "CARD_NO", nullable = true)
    private String cardNo;

    @Column(name = "CREATED_DATE", nullable = false)
    private Date createdDate;

    @Column(name = "START_SERVICE_DATE", nullable = true)
    private Date startServiceDate;

    @Column(name = "END_SERVICE_DATE", nullable = true)
    private Date endServiceDate;

    @Column(name = "IP", nullable = false)
    private String ip;

    @Column(name = "PORT", nullable = false)
    private String port;

    @Column(name = "WAIT_TIME", nullable = false)
    private Integer waitTime;

    @Column(name = "SERVICE_TYPE", nullable = false)
    private String serviceType;

    @Column(name = "CUST_TYPE", nullable = false)
    private String custType;

    @Column(name = "PROCESS_RESULT", nullable = false)
    private String processResult;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getStartServiceDate() {
        return startServiceDate;
    }

    public void setStartServiceDate(Date startServiceDate) {
        this.startServiceDate = startServiceDate;
    }

    public Date getEndServiceDate() {
        return endServiceDate;
    }

    public void setEndServiceDate(Date endServiceDate) {
        this.endServiceDate = endServiceDate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }
}
