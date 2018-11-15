package com.sunland.pojo;

import java.io.Serializable;

public class VehicleinfoRequest implements Serializable {
    private String pid;

    private String hphm;

    private String hpzl;

    private String issearcher;

    private static final long serialVersionUID = 1L;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getHphm() {
        return hphm;
    }

    public void setHphm(String hphm) {
        this.hphm = hphm == null ? null : hphm.trim();
    }

    public String getHpzl() {
        return hpzl;
    }

    public void setHpzl(String hpzl) {
        this.hpzl = hpzl == null ? null : hpzl.trim();
    }

    public String getIssearcher() {
        return issearcher;
    }

    public void setIssearcher(String issearcher) {
        this.issearcher = issearcher == null ? null : issearcher.trim();
    }

    @Override
    public String toString() {
        return "VehicleinfoRequest{" +
                "hphm='" + hphm + '\'' +
                ", hpzl='" + hpzl + '\'' +
                '}';
    }
}