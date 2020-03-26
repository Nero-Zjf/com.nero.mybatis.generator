package com.nero.mybatis.generator.entity;

import java.util.Date;

public class Robot {
    private Long robotId;

    private String robotNum;

    private String sn;

    private Long robotMnId;

    private Date productDate;

    private Date deployDate;

    private Integer maintianTime;

    private Integer chargeTime;

    private Integer scramTime;

    private Integer taskTime;

    private Double mileage;

    private Double dayMileage;

    private Boolean del;

    private Long updmark;

    private Long opuserid;

    private Date optime;

    public Long getRobotId() {
        return robotId;
    }

    public void setRobotId(Long robotId) {
        this.robotId = robotId;
    }

    public String getRobotNum() {
        return robotNum;
    }

    public void setRobotNum(String robotNum) {
        this.robotNum = robotNum == null ? null : robotNum.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Long getRobotMnId() {
        return robotMnId;
    }

    public void setRobotMnId(Long robotMnId) {
        this.robotMnId = robotMnId;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Date getDeployDate() {
        return deployDate;
    }

    public void setDeployDate(Date deployDate) {
        this.deployDate = deployDate;
    }

    public Integer getMaintianTime() {
        return maintianTime;
    }

    public void setMaintianTime(Integer maintianTime) {
        this.maintianTime = maintianTime;
    }

    public Integer getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(Integer chargeTime) {
        this.chargeTime = chargeTime;
    }

    public Integer getScramTime() {
        return scramTime;
    }

    public void setScramTime(Integer scramTime) {
        this.scramTime = scramTime;
    }

    public Integer getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(Integer taskTime) {
        this.taskTime = taskTime;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public Double getDayMileage() {
        return dayMileage;
    }

    public void setDayMileage(Double dayMileage) {
        this.dayMileage = dayMileage;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public Long getUpdmark() {
        return updmark;
    }

    public void setUpdmark(Long updmark) {
        this.updmark = updmark;
    }

    public Long getOpuserid() {
        return opuserid;
    }

    public void setOpuserid(Long opuserid) {
        this.opuserid = opuserid;
    }

    public Date getOptime() {
        return optime;
    }

    public void setOptime(Date optime) {
        this.optime = optime;
    }
}