package com.springbatis.springbatisboot.StatiscticsModels;

import java.util.List;

public class StatisticsFlights {
    public List<ReservationUnit> fligths;
    public int totalFligths;

    public StatisticsFlights(List<ReservationUnit> fligths, int totalFligths) {
        this.fligths = fligths;
        this.totalFligths = totalFligths;
    }

    public List<ReservationUnit> getFligths() {
        return fligths;
    }

    public void setFligths(List<ReservationUnit> fligths) {
        this.fligths = fligths;
    }

    public int getTotalFligths() {
        return totalFligths;
    }

    public void setTotalFligths(int totalFligths) {
        this.totalFligths = totalFligths;
    }
}
