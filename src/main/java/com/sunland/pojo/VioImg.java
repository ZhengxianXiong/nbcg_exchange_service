package com.sunland.pojo;

import java.io.Serializable;
import java.util.Date;

public class VioImg implements Serializable {
    private Integer pid;

    private Integer vioid;

    private Date inserttime;

    private Integer imgindex;

    private String jllx;

    private Date updatetime;

    private byte[] content;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getVioid() {
        return vioid;
    }

    public void setVioid(Integer vioid) {
        this.vioid = vioid;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    public Integer getImgindex() {
        return imgindex;
    }

    public void setImgindex(Integer imgindex) {
        this.imgindex = imgindex;
    }

    public String getJllx() {
        return jllx;
    }

    public void setJllx(String jllx) {
        this.jllx = jllx == null ? null : jllx.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}