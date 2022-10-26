package com.example.pnt.hit.todoapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Task implements Serializable {
    @PrimaryKey(autoGenerate = true)
    int taskId;

    @ColumnInfo(name = "taskTitle")
    String taskTitle;

    @ColumnInfo(name = "date")
    String date;

    @ColumnInfo(name = "taskDescription")
    String taskDescription;

    @ColumnInfo(name = "isComplete")
    boolean isComplete;

    @ColumnInfo(name = "firstAlarmTime")
    String firstAlarmTime;

    @ColumnInfo(name = "secondAlarmTime")
    String secondAlarmTime;

    @ColumnInfo(name = "lastAlarm")
    String lastAlarm;

    @ColumnInfo(name = "event")
    String event;

    public Task(
            int taskId,
            String taskTitle,
            String date,
            String taskDescription,
            boolean isComplete,
            String firstAlarmTime,
            String secondAlarmTime,
            String lastAlarm,
            String event
    ) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.date = date;
        this.taskDescription = taskDescription;
        this.isComplete = isComplete;
        this.firstAlarmTime = firstAlarmTime;
        this.secondAlarmTime = secondAlarmTime;
        this.lastAlarm = lastAlarm;
        this.event = event;
    }

    public Task() {
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getFirstAlarmTime() {
        return firstAlarmTime;
    }

    public void setFirstAlarmTime(String firstAlarmTime) {
        this.firstAlarmTime = firstAlarmTime;
    }

    public String getSecondAlarmTime() {
        return secondAlarmTime;
    }

    public void setSecondAlarmTime(String secondAlarmTime) {
        this.secondAlarmTime = secondAlarmTime;
    }

    public String getLastAlarm() {
        return lastAlarm;
    }

    public void setLastAlarm(String lastAlarm) {
        this.lastAlarm = lastAlarm;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
