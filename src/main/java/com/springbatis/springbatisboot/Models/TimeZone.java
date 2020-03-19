package com.springbatis.springbatisboot.Models;

public class TimeZone {
    public String timeZone;
    public int id;

    public TimeZone(String timeZone, int id) {
        this.timeZone = timeZone;
        this.id = id;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
