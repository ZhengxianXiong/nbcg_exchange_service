package com.sunland.pojo;

import com.sunland.dto.Message;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Vio extends Message implements Serializable {
    private Integer vioid;

    private String xh;

    private String ajbh;

    private String billno;

    private String jdsbh;

    private String hpzl;

    private String hphm;

    private Date wfsj;

    private String wfxw;

    private Integer fkje;

    private String cjmj1;

    private String cjmj2;

    private Integer deptid;

    private Integer punishdeptid;

    private String moneyregioncode;

    private String regioncode;

    private String punishregioncode;

    private String lockstate;

    private String lockisintb;

    private Integer locknum;

    private String unlockstate;

    private String unlockisintb;

    private Integer unlocknum;

    private String flowcode;

    private String sfja;

    private String sjly;

    private String jszh;

    private BigDecimal znj;

    private String jkfs;

    private Date jkrq;

    private String clr;

    private Date clsj;

    private String clbj;

    private String jkbj;

    private String jmznjbj;

    private Date updatetime;

    private String jar;

    private Date jasj;

    private String clfs;

    private String jllx;

    private Date deletetime;

    private String jkqd;

    private String tzbj;

    private Date tzrq;

    private String roadcode;

    private String roadname;

    private String lrr;

    private Date lrsj;

    private String bz;

    private String lockerror;

    private Date locktime;

    private String unlockerror;

    private Date unlocktime;

    private String dsr;

    private String lxdh;

    private String xxdz;

    private String dsrxxdz;

    private Integer lockzdcs;

    private Integer unlockzdcs;

    private String jafs;

    private String invoicepid;

    private List<VioImg> imgList;

    private static final long serialVersionUID = 1L;

    public Integer getVioid() {
        return vioid;
    }

    public void setVioid(Integer vioid) {
        this.vioid = vioid;
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh == null ? null : ajbh.trim();
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getJdsbh() {
        return jdsbh;
    }

    public void setJdsbh(String jdsbh) {
        this.jdsbh = jdsbh == null ? null : jdsbh.trim();
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

    public Date getWfsj() {
        return wfsj;
    }

    public void setWfsj(Date wfsj) {
        this.wfsj = wfsj;
    }

    public String getWfxw() {
        return wfxw;
    }

    public void setWfxw(String wfxw) {
        this.wfxw = wfxw == null ? null : wfxw.trim();
    }

    public Integer getFkje() {
        return fkje;
    }

    public void setFkje(Integer fkje) {
        this.fkje = fkje;
    }

    public String getCjmj1() {
        return cjmj1;
    }

    public void setCjmj1(String cjmj1) {
        this.cjmj1 = cjmj1 == null ? null : cjmj1.trim();
    }

    public String getCjmj2() {
        return cjmj2;
    }

    public void setCjmj2(String cjmj2) {
        this.cjmj2 = cjmj2 == null ? null : cjmj2.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getPunishdeptid() {
        return punishdeptid;
    }

    public void setPunishdeptid(Integer punishdeptid) {
        this.punishdeptid = punishdeptid;
    }

    public String getMoneyregioncode() {
        return moneyregioncode;
    }

    public void setMoneyregioncode(String moneyregioncode) {
        this.moneyregioncode = moneyregioncode == null ? null : moneyregioncode.trim();
    }

    public String getRegioncode() {
        return regioncode;
    }

    public void setRegioncode(String regioncode) {
        this.regioncode = regioncode == null ? null : regioncode.trim();
    }

    public String getPunishregioncode() {
        return punishregioncode;
    }

    public void setPunishregioncode(String punishregioncode) {
        this.punishregioncode = punishregioncode == null ? null : punishregioncode.trim();
    }

    public String getLockstate() {
        return lockstate;
    }

    public void setLockstate(String lockstate) {
        this.lockstate = lockstate == null ? null : lockstate.trim();
    }

    public String getLockisintb() {
        return lockisintb;
    }

    public void setLockisintb(String lockisintb) {
        this.lockisintb = lockisintb == null ? null : lockisintb.trim();
    }

    public Integer getLocknum() {
        return locknum;
    }

    public void setLocknum(Integer locknum) {
        this.locknum = locknum;
    }

    public String getUnlockstate() {
        return unlockstate;
    }

    public void setUnlockstate(String unlockstate) {
        this.unlockstate = unlockstate == null ? null : unlockstate.trim();
    }

    public String getUnlockisintb() {
        return unlockisintb;
    }

    public void setUnlockisintb(String unlockisintb) {
        this.unlockisintb = unlockisintb == null ? null : unlockisintb.trim();
    }

    public Integer getUnlocknum() {
        return unlocknum;
    }

    public void setUnlocknum(Integer unlocknum) {
        this.unlocknum = unlocknum;
    }

    public String getFlowcode() {
        return flowcode;
    }

    public void setFlowcode(String flowcode) {
        this.flowcode = flowcode == null ? null : flowcode.trim();
    }

    public String getSfja() {
        return sfja;
    }

    public void setSfja(String sfja) {
        this.sfja = sfja == null ? null : sfja.trim();
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly == null ? null : sjly.trim();
    }

    public String getJszh() {
        return jszh;
    }

    public void setJszh(String jszh) {
        this.jszh = jszh == null ? null : jszh.trim();
    }

    public BigDecimal getZnj() {
        return znj;
    }

    public void setZnj(BigDecimal znj) {
        this.znj = znj;
    }

    public String getJkfs() {
        return jkfs;
    }

    public void setJkfs(String jkfs) {
        this.jkfs = jkfs == null ? null : jkfs.trim();
    }

    public Date getJkrq() {
        return jkrq;
    }

    public void setJkrq(Date jkrq) {
        this.jkrq = jkrq;
    }

    public String getClr() {
        return clr;
    }

    public void setClr(String clr) {
        this.clr = clr == null ? null : clr.trim();
    }

    public Date getClsj() {
        return clsj;
    }

    public void setClsj(Date clsj) {
        this.clsj = clsj;
    }

    public String getClbj() {
        return clbj;
    }

    public void setClbj(String clbj) {
        this.clbj = clbj == null ? null : clbj.trim();
    }

    public String getJkbj() {
        return jkbj;
    }

    public void setJkbj(String jkbj) {
        this.jkbj = jkbj == null ? null : jkbj.trim();
    }

    public String getJmznjbj() {
        return jmznjbj;
    }

    public void setJmznjbj(String jmznjbj) {
        this.jmznjbj = jmznjbj == null ? null : jmznjbj.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getJar() {
        return jar;
    }

    public void setJar(String jar) {
        this.jar = jar == null ? null : jar.trim();
    }

    public Date getJasj() {
        return jasj;
    }

    public void setJasj(Date jasj) {
        this.jasj = jasj;
    }

    public String getClfs() {
        return clfs;
    }

    public void setClfs(String clfs) {
        this.clfs = clfs == null ? null : clfs.trim();
    }

    public String getJllx() {
        return jllx;
    }

    public void setJllx(String jllx) {
        this.jllx = jllx == null ? null : jllx.trim();
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public String getJkqd() {
        return jkqd;
    }

    public void setJkqd(String jkqd) {
        this.jkqd = jkqd == null ? null : jkqd.trim();
    }

    public String getTzbj() {
        return tzbj;
    }

    public void setTzbj(String tzbj) {
        this.tzbj = tzbj == null ? null : tzbj.trim();
    }

    public Date getTzrq() {
        return tzrq;
    }

    public void setTzrq(Date tzrq) {
        this.tzrq = tzrq;
    }

    public String getRoadcode() {
        return roadcode;
    }

    public void setRoadcode(String roadcode) {
        this.roadcode = roadcode == null ? null : roadcode.trim();
    }

    public String getRoadname() {
        return roadname;
    }

    public void setRoadname(String roadname) {
        this.roadname = roadname == null ? null : roadname.trim();
    }

    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr == null ? null : lrr.trim();
    }

    public Date getLrsj() {
        return lrsj;
    }

    public void setLrsj(Date lrsj) {
        this.lrsj = lrsj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getLockerror() {
        return lockerror;
    }

    public void setLockerror(String lockerror) {
        this.lockerror = lockerror == null ? null : lockerror.trim();
    }

    public Date getLocktime() {
        return locktime;
    }

    public void setLocktime(Date locktime) {
        this.locktime = locktime;
    }

    public String getUnlockerror() {
        return unlockerror;
    }

    public void setUnlockerror(String unlockerror) {
        this.unlockerror = unlockerror == null ? null : unlockerror.trim();
    }

    public Date getUnlocktime() {
        return unlocktime;
    }

    public void setUnlocktime(Date unlocktime) {
        this.unlocktime = unlocktime;
    }

    public String getDsr() {
        return dsr;
    }

    public void setDsr(String dsr) {
        this.dsr = dsr == null ? null : dsr.trim();
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    public String getXxdz() {
        return xxdz;
    }

    public void setXxdz(String xxdz) {
        this.xxdz = xxdz == null ? null : xxdz.trim();
    }

    public String getDsrxxdz() {
        return dsrxxdz;
    }

    public void setDsrxxdz(String dsrxxdz) {
        this.dsrxxdz = dsrxxdz == null ? null : dsrxxdz.trim();
    }

    public Integer getLockzdcs() {
        return lockzdcs;
    }

    public void setLockzdcs(Integer lockzdcs) {
        this.lockzdcs = lockzdcs;
    }

    public Integer getUnlockzdcs() {
        return unlockzdcs;
    }

    public void setUnlockzdcs(Integer unlockzdcs) {
        this.unlockzdcs = unlockzdcs;
    }

    public String getJafs() {
        return jafs;
    }

    public void setJafs(String jafs) {
        this.jafs = jafs == null ? null : jafs.trim();
    }

    public String getInvoicepid() {
        return invoicepid;
    }

    public void setInvoicepid(String invoicepid) {
        this.invoicepid = invoicepid == null ? null : invoicepid.trim();
    }

    public List<VioImg> getImgList() {
        return imgList;
    }

    public void setImgList(List<VioImg> imgList) {
        this.imgList = imgList;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    @Override
    public String toString() {
        return "Vio{" +
                "vioid=" + vioid +
                ", ajbh='" + ajbh + '\'' +
                ", billno='" + billno + '\'' +
                ", hpzl='" + hpzl + '\'' +
                ", hphm='" + hphm + '\'' +
                ", wfsj=" + wfsj +
                ", wfxw='" + wfxw + '\'' +
                ", fkje=" + fkje +
                ", cjmj1='" + cjmj1 + '\'' +
                ", cjmj2='" + cjmj2 + '\'' +
                ", deptid=" + deptid +
                ", regioncode='" + regioncode + '\'' +
                ", sjly='" + sjly + '\'' +
                ", roadcode='" + roadcode + '\'' +
                ", roadname='" + roadname + '\'' +
                ", lrr='" + lrr + '\'' +
                ", lrsj=" + lrsj +
                ", bz='" + bz + '\'' +
                '}';
    }
}