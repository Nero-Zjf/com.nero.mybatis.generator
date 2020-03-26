package com.nero.mybatis.generator.entity;

import java.util.Date;

public class Task {
    private Long taskId;

    private Long robotId;

    private Integer taskType;

    private Integer taskState;

    private Date startTime;

    private Date interruptedTime;

    private Date endTime;

    private Double startX;

    private Double startY;

    private Double startZ;

    private Double endX;

    private Double endY;

    private Double endZ;

    private Double realEndX;

    private Double realEndY;

    private Double realEndZ;

    private Double interruptedX;

    private Double interruptedY;

    private Double interruptedZ;

    private String planPath;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getRobotId() {
        return robotId;
    }

    public void setRobotId(Long robotId) {
        this.robotId = robotId;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getInterruptedTime() {
        return interruptedTime;
    }

    public void setInterruptedTime(Date interruptedTime) {
        this.interruptedTime = interruptedTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getStartX() {
        return startX;
    }

    public void setStartX(Double startX) {
        this.startX = startX;
    }

    public Double getStartY() {
        return startY;
    }

    public void setStartY(Double startY) {
        this.startY = startY;
    }

    public Double getStartZ() {
        return startZ;
    }

    public void setStartZ(Double startZ) {
        this.startZ = startZ;
    }

    public Double getEndX() {
        return endX;
    }

    public void setEndX(Double endX) {
        this.endX = endX;
    }

    public Double getEndY() {
        return endY;
    }

    public void setEndY(Double endY) {
        this.endY = endY;
    }

    public Double getEndZ() {
        return endZ;
    }

    public void setEndZ(Double endZ) {
        this.endZ = endZ;
    }

    public Double getRealEndX() {
        return realEndX;
    }

    public void setRealEndX(Double realEndX) {
        this.realEndX = realEndX;
    }

    public Double getRealEndY() {
        return realEndY;
    }

    public void setRealEndY(Double realEndY) {
        this.realEndY = realEndY;
    }

    public Double getRealEndZ() {
        return realEndZ;
    }

    public void setRealEndZ(Double realEndZ) {
        this.realEndZ = realEndZ;
    }

    public Double getInterruptedX() {
        return interruptedX;
    }

    public void setInterruptedX(Double interruptedX) {
        this.interruptedX = interruptedX;
    }

    public Double getInterruptedY() {
        return interruptedY;
    }

    public void setInterruptedY(Double interruptedY) {
        this.interruptedY = interruptedY;
    }

    public Double getInterruptedZ() {
        return interruptedZ;
    }

    public void setInterruptedZ(Double interruptedZ) {
        this.interruptedZ = interruptedZ;
    }

    public String getPlanPath() {
        return planPath;
    }

    public void setPlanPath(String planPath) {
        this.planPath = planPath == null ? null : planPath.trim();
    }
}