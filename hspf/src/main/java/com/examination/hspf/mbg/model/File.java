package com.examination.hspf.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class File implements Serializable {
    private Integer id;

    private String originName;

    private String newName;

    private String suffixName;

    private Integer modid;

    private Date upTime;

    private Double fileSize;

    private Integer uid;

    private Integer pass;

    private Integer aid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getSuffixName() {
        return suffixName;
    }

    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName;
    }

    public Integer getModid() {
        return modid;
    }

    public void setModid(Integer modid) {
        this.modid = modid;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public Double getFileSize() {
        return fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", originName=").append(originName);
        sb.append(", newName=").append(newName);
        sb.append(", suffixName=").append(suffixName);
        sb.append(", modid=").append(modid);
        sb.append(", upTime=").append(upTime);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", uid=").append(uid);
        sb.append(", pass=").append(pass);
        sb.append(", aid=").append(aid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}