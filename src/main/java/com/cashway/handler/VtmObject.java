package com.cashway.handler;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mmzz on 2014/7/14.
 */
public class VtmObject {

    @SerializedName("MessageType")
    private String messageType;

    @SerializedName("TermId")
    private String termId;

    @SerializedName("TranTime")
    private String tranTime;

    @SerializedName("TransactionType")
    private String transactionType;

    @SerializedName("OrgNo")
    private String orgNo;

    @SerializedName("TermIp")
    private String termIp;

    @SerializedName("LocalVideoPort")
    private String localVideoPort;

    @SerializedName("LocalAudioPort")
    private String localAudioPort;

    @SerializedName("RemoteVideoPort")
    private String remoteVideoPort;

    @SerializedName("RemoteAudioPort")
    private String remoteAudioPort;

    @SerializedName("BankCardNo")
    private String bankCardNo;

    @SerializedName("IDCardNo")
    private String iDCardNo;

    @SerializedName("IDCardPhoto")
    private String iDCardPhoto;

    @SerializedName("UserName")
    private String userName;

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getTermIp() {
        return termIp;
    }

    public void setTermIp(String termIp) {
        this.termIp = termIp;
    }

    public String getLocalVideoPort() {
        return localVideoPort;
    }

    public void setLocalVideoPort(String localVideoPort) {
        this.localVideoPort = localVideoPort;
    }

    public String getLocalAudioPort() {
        return localAudioPort;
    }

    public void setLocalAudioPort(String localAudioPort) {
        this.localAudioPort = localAudioPort;
    }

    public String getRemoteVideoPort() {
        return remoteVideoPort;
    }

    public void setRemoteVideoPort(String remoteVideoPort) {
        this.remoteVideoPort = remoteVideoPort;
    }

    public String getRemoteAudioPort() {
        return remoteAudioPort;
    }

    public void setRemoteAudioPort(String remoteAudioPort) {
        this.remoteAudioPort = remoteAudioPort;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getiDCardNo() {
        return iDCardNo;
    }

    public void setiDCardNo(String iDCardNo) {
        this.iDCardNo = iDCardNo;
    }

    public String getiDCardPhoto() {
        return iDCardPhoto;
    }

    public void setiDCardPhoto(String iDCardPhoto) {
        this.iDCardPhoto = iDCardPhoto;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
