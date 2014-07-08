package com.cashway.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mmzz on 2014/6/24.
 */
@Entity
@Table(name = "AGENTS_SERVICE_HISTORY")
public class ArtificialAgentsServiceHistory {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "SQ_AGENTS_SERVICE_HISTORY", initialValue=1000, allocationSize=1)
    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "AGENTS_ID", referencedColumnName = "ID", nullable = false)
    private ArtificialAgents artificialAgents;

    @Column(name = "START_SERVICE_DATE", nullable = false)
    private Date startServiceDate;

    @Column(name = "END_SERVICE_DATE", nullable = false)
    private Date endServiceDate;

    @Column(name = "CUST_NAME", nullable = false)
    private String custName;

    @Column(name = "CARD_NO", nullable = false)
    private String cardNo;

    @Column(name = "PERSON_ID", nullable = false)
    private String personId;

    @Column(name = "CUST_IP", nullable = false)
    private String custIp;

    @Column(name = "CUST_PORT", nullable = false)
    private String custPort;

    @Column(name = "CUST_TYPE", nullable = false)
    private String custType;

    @Column(name = "AGENTS_TYPE", nullable = false)
    private String agentsType;

    @Column(name = "SERVICE_TYPE", nullable = false)
    private String serviceType;

    @Column(name = "REMARK", nullable = true)
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArtificialAgents getArtificialAgents() {
        return artificialAgents;
    }

    public void setArtificialAgents(ArtificialAgents artificialAgents) {
        this.artificialAgents = artificialAgents;
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

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getCustIp() {
        return custIp;
    }

    public void setCustIp(String custIp) {
        this.custIp = custIp;
    }

    public String getCustPort() {
        return custPort;
    }

    public void setCustPort(String custPort) {
        this.custPort = custPort;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getAgentsType() {
        return agentsType;
    }

    public void setAgentsType(String agentsType) {
        this.agentsType = agentsType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
