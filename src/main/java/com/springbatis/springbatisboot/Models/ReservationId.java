package com.springbatis.springbatisboot.Models;


import org.springframework.lang.NonNull;

public class ReservationId {

    public int reservationId;

    public ReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public ReservationId(){}

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }
}
