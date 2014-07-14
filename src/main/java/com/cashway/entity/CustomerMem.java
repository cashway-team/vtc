package com.cashway.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mmzz on 2014/6/25.
 */
@Entity
@Table(name = "CUST_MEM")
public class CustomerMem implements Serializable {

    public interface Type {
        String NORMAL = "0";
        String GOLD_CARD = "1";
        String VIP = "2";
    }


    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "SQ_CUST_MEM", initialValue=1000, allocationSize=1)
    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    private String ip;

    private String port;

    private String cardNo;

    @Column(name = "SERVICE_TYPE", nullable = false)
    private String serviceType;

    @Column(name = "CREATED_DATE", nullable = false)
    private String createdDate;

    @Column(name = "WAIT_TIME", nullable = false)
    private Integer waitTime;

    @Column(name = "CUST_TYPE", nullable = false)
    private String custType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }
}
