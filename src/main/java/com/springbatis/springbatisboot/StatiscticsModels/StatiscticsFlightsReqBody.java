package com.springbatis.springbatisboot.StatiscticsModels;

public class StatiscticsFlightsReqBody {
    public int hourStartBound;
    public int hourEndBound;
    public String startDate;
    public String stopDate;

    public StatiscticsFlightsReqBody(int hourStartBound, int hourEndBound, String startDate, String stopDate) {
        this.hourStartBound = hourStartBound;
        this.hourEndBound = hourEndBound;
        this.startDate = startDate;
        this.stopDate = stopDate;
    }

    public int getHourStartBound() {
        return hourStartBound;
    }

    public void setHourStartBound(int hourStartBound) {
        this.hourStartBound = hourStartBound;
    }

    public int getHourEndBound() {
        return hourEndBound;
    }

    public void setHourEndBound(int hourEndBound) {
        this.hourEndBound = hourEndBound;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStopDate() {
        return stopDate;
    }

    public void setStopDate(String stopDate) {
        this.stopDate = stopDate;
    }
}
