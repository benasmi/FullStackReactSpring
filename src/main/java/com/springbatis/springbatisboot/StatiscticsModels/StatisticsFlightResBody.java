package com.springbatis.springbatisboot.StatiscticsModels;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StatisticsFlightResBody {
    public Object flightNumber;
    public Object fullName;
    public Object email;
    public Object hourDuration;
    public Object minuteDuration;
    public Object reservationId;
    public Object totalDifCardsPerUser;
    public Object totalPaymentPerReservation;
    public Object totalPaymentSumPerReservation;
    public Object totalDifCardsUsedPerReservation;
    public Object payments;

    public StatisticsFlightResBody(Object flightNumber, Object fullName, Object email, Object hourDuration, Object minuteDuration, Object reservationId, Object totalDifCardsPerUser, Object totalPaymentPerReservation, Object totalPaymentSumPerReservation, Object totalDifCardsUsedPerReservation) {
        this.flightNumber = flightNumber;
        this.fullName = fullName;
        this.email = email;
        this.hourDuration = hourDuration;
        this.minuteDuration = minuteDuration;
        this.reservationId = reservationId;
        this.totalDifCardsPerUser = totalDifCardsPerUser;
        this.totalPaymentPerReservation = totalPaymentPerReservation;
        this.totalPaymentSumPerReservation = totalPaymentSumPerReservation;
        this.totalDifCardsUsedPerReservation = totalDifCardsUsedPerReservation;

    }

    public Object getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Object flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Object getFullName() {
        return fullName;
    }

    public void setFullName(Object fullName) {
        this.fullName = fullName;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getHourDuration() {
        return hourDuration;
    }

    public void setHourDuration(Object hourDuration) {
        this.hourDuration = hourDuration;
    }

    public Object getMinuteDuration() {
        return minuteDuration;
    }

    public void setMinuteDuration(Object minuteDuration) {
        this.minuteDuration = minuteDuration;
    }

    public Object getReservationId() {
        return reservationId;
    }

    public void setReservationId(Object reservationId) {
        this.reservationId = reservationId;
    }

    public Object getTotalDifCardsPerUser() {
        return totalDifCardsPerUser;
    }

    public void setTotalDifCardsPerUser(Object totalDifCardsPerUser) {
        this.totalDifCardsPerUser = totalDifCardsPerUser;
    }

    public Object getTotalPaymentPerReservation() {
        return totalPaymentPerReservation;
    }

    public void setTotalPaymentPerReservation(Object totalPaymentPerReservation) {
        this.totalPaymentPerReservation = totalPaymentPerReservation;
    }

    public Object getTotalPaymentSumPerReservation() {
        return totalPaymentSumPerReservation;
    }

    public void setTotalPaymentSumPerReservation(Object totalPaymentSumPerReservation) {
        this.totalPaymentSumPerReservation = totalPaymentSumPerReservation;
    }

    public Object getTotalDifCardsUsedPerReservation() {
        return totalDifCardsUsedPerReservation;
    }

    public void setTotalDifCardsUsedPerReservation(Object totalDifCardsUsedPerReservation) {
        this.totalDifCardsUsedPerReservation = totalDifCardsUsedPerReservation;
    }

}
