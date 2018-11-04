package org.spring.springboot.domain;

import java.util.Date;

public class Meetroom {
    private Integer meetId;

    private String meetUser;

    private String roomName;

    private Date meetStartTime;

    private Date meetEndTime;

    private Date meetDate;

    private String meetContent;

    private String meetTitle;

    private String meetConventioner;

    public Integer getMeetId() {
        return meetId;
    }

    public void setMeetId(Integer meetId) {
        this.meetId = meetId;
    }

    public String getMeetUser() {
        return meetUser;
    }

    public void setMeetUser(String meetUser) {
        this.meetUser = meetUser == null ? null : meetUser.trim();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public Date getMeetStartTime() {
        return meetStartTime;
    }

    public void setMeetStartTime(Date meetStartTime) {
        this.meetStartTime = meetStartTime;
    }

    public Date getMeetEndTime() {
        return meetEndTime;
    }

    public void setMeetEndTime(Date meetEndTime) {
        this.meetEndTime = meetEndTime;
    }

    public Date getMeetDate() {
        return meetDate;
    }

    public void setMeetDate(Date meetDate) {
        this.meetDate = meetDate;
    }

    public String getMeetContent() {
        return meetContent;
    }

    public void setMeetContent(String meetContent) {
        this.meetContent = meetContent == null ? null : meetContent.trim();
    }

    public String getMeetTitle() {
        return meetTitle;
    }

    public void setMeetTitle(String meetTitle) {
        this.meetTitle = meetTitle == null ? null : meetTitle.trim();
    }

    public String getMeetConventioner() {
        return meetConventioner;
    }

    public void setMeetConventioner(String meetConventioner) {
        this.meetConventioner = meetConventioner == null ? null : meetConventioner.trim();
    }
}