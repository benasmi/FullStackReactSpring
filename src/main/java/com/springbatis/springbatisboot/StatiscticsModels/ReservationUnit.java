package com.springbatis.springbatisboot.StatiscticsModels;

import com.springbatis.springbatisboot.Models.Reservation;

import java.util.List;

public class ReservationUnit {
    List<Reservation> reservationList;
    int totalReservations;


    public ReservationUnit(List<Reservation> reservationList, int totalReservations) {
        this.reservationList = reservationList;
        this.totalReservations = totalReservations;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public int getTotalReservations() {
        return totalReservations;
    }

    public void setTotalReservations(int totalReservations) {
        this.totalReservations = totalReservations;
    }

}
