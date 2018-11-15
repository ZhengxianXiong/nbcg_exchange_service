package com.sunland.pojo;

import com.sunland.dto.Message;

import java.io.Serializable;
import java.util.Date;

public class VehicleInfo extends Message implements Serializable {
    private String lsh;

    private String hpzl;

    private String hphm;

    private String clpp1;

    private String clxh;

    private String clsbdh;

    private String fdjh;

    private String cllx;

    private String csys;

    private String syxz;

    private String sfzmhm;

    private String sfzmmc;

    private String syr;

    private Date ccdjrq;

    private Date yxqz;

    private Date fdjrq;

    private String zsxzqh;

    private String zsxxdz;

    private String yzbm1;

    private String lxdh;

    private String zzz;

    private String czy;

    private String imei;

    private Date cxsj;

    private byte[] zp;

    private static final long serialVersionUID = 1L;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh == null ? null : lsh.trim();
    }

    public String getHpzl() {
        return hpzl;
    }

    public void setHpzl(String hpzl) {
        this.hpzl = hpzl == null ? null : hpzl.trim();
    }

    public String getHphm() {
        return hphm;
    }

    public void setHphm(String hphm) {
        this.hphm = hphm == null ? null : hphm.trim();
    }

    public String getClpp1() {
        return clpp1;
    }

    public void setClpp1(String clpp1) {
        this.clpp1 = clpp1 == null ? null : clpp1.trim();
    }

    public String getClxh() {
        return clxh;
    }

    public void setClxh(String clxh) {
        this.clxh = clxh == null ? null : clxh.trim();
    }

    public String getClsbdh() {
        return clsbdh;
    }

    public void setClsbdh(String clsbdh) {
        this.clsbdh = clsbdh == null ? null : clsbdh.trim();
    }

    public String getFdjh() {
        return fdjh;
    }

    public void setFdjh(String fdjh) {
        this.fdjh = fdjh == null ? null : fdjh.trim();
    }

    public String getCllx() {
        return cllx;
    }

    public void setCllx(String cllx) {
        this.cllx = cllx == null ? null : cllx.trim();
    }

    public String getCsys() {
        return csys;
    }

    public void setCsys(String csys) {
        this.csys = csys == null ? null : csys.trim();
    }

    public String getSyxz() {
        return syxz;
    }

    public void setSyxz(String syxz) {
        this.syxz = syxz == null ? null : syxz.trim();
    }

    public String getSfzmhm() {
        return sfzmhm;
    }

    public void setSfzmhm(String sfzmhm) {
        this.sfzmhm = sfzmhm == null ? null : sfzmhm.trim();
    }

    public String getSfzmmc() {
        return sfzmmc;
    }

    public void setSfzmmc(String sfzmmc) {
        this.sfzmmc = sfzmmc == null ? null : sfzmmc.trim();
    }

    public String getSyr() {
        return syr;
    }

    public void setSyr(String syr) {
        this.syr = syr == null ? null : syr.trim();
    }

    public Date getCcdjrq() {
        return ccdjrq;
    }

    public void setCcdjrq(Date ccdjrq) {
        this.ccdjrq = ccdjrq;
    }

    public Date getYxqz() {
        return yxqz;
    }

    public void setYxqz(Date yxqz) {
        this.yxqz = yxqz;
    }

    public Date getFdjrq() {
        return fdjrq;
    }

    public void setFdjrq(Date fdjrq) {
        this.fdjrq = fdjrq;
    }

    public String getZsxzqh() {
        return zsxzqh;
    }

    public void setZsxzqh(String zsxzqh) {
        this.zsxzqh = zsxzqh == null ? null : zsxzqh.trim();
    }

    public String getZsxxdz() {
        return zsxxdz;
    }

    public void setZsxxdz(String zsxxdz) {
        this.zsxxdz = zsxxdz == null ? null : zsxxdz.trim();
    }

    public String getYzbm1() {
        return yzbm1;
    }

    public void setYzbm1(String yzbm1) {
        this.yzbm1 = yzbm1 == null ? null : yzbm1.trim();
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    public String getZzz() {
        return zzz;
    }

    public void setZzz(String zzz) {
        this.zzz = zzz == null ? null : zzz.trim();
    }

    public String getCzy() {
        return czy;
    }

    public void setCzy(String czy) {
        this.czy = czy == null ? null : czy.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public Date getCxsj() {
        return cxsj;
    }

    public void setCxsj(Date cxsj) {
        this.cxsj = cxsj;
    }

    public byte[] getZp() {
        return zp;
    }

    public void setZp(byte[] zp) {
        this.zp = zp;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "hpzl='" + hpzl + '\'' +
                ", hphm='" + hphm + '\'' +
                ", lxdh='" + lxdh + '\'' +
                '}';
    }
}