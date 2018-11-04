package org.spring.springboot.domain;

import java.util.Date;

public class Rootname {
    private Integer rootId;

    private String rootName;

    private Integer rootEnabled;

    private Date rootReserveTime;

    private Date rootReserveDate;

    private Date rootFreeTime;

    public Integer getRootId() {
        return rootId;
    }

    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }

    public String getRootName() {
        return rootName;
    }

    public void setRootName(String rootName) {
        this.rootName = rootName == null ? null : rootName.trim();
    }

    public Integer getRootEnabled() {
        return rootEnabled;
    }

    public void setRootEnabled(Integer rootEnabled) {
        this.rootEnabled = rootEnabled;
    }

    public Date getRootReserveTime() {
        return rootReserveTime;
    }

    public void setRootReserveTime(Date rootReserveTime) {
        this.rootReserveTime = rootReserveTime;
    }

    public Date getRootReserveDate() {
        return rootReserveDate;
    }

    public void setRootReserveDate(Date rootReserveDate) {
        this.rootReserveDate = rootReserveDate;
    }

    public Date getRootFreeTime() {
        return rootFreeTime;
    }

    public void setRootFreeTime(Date rootFreeTime) {
        this.rootFreeTime = rootFreeTime;
    }
}