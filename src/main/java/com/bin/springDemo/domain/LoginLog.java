package com.bin.springDemo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by richard02.zhang on 2016/6/17.
 */
public class LoginLog implements Serializable {
    private int userId;
    private int loginLogId;
    private String ip;
    private Date loginDatetime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
                "userId=" + userId +
                ", loginLogId=" + loginLogId +
                ", ip='" + ip + '\'' +
                ", loginDatetime=" + loginDatetime +
                '}';
    }
}
