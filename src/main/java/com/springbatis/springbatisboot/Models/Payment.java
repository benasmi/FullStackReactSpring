package com.springbatis.springbatisboot.Models;

public class Payment {
    int paymentId;
    float paymentAmount;
    String paymentDate;
    String fk_cardNumber;
    String fk_currency;
    String fk_reservationId;

    public Payment(int paymentId, float paymentAmount, String paymentDate, String fk_cardNumber, String fk_currency, String fk_reservationId) {
        this.paymentId = paymentId;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.fk_cardNumber = fk_cardNumber;
        this.fk_currency = fk_currency;
        this.fk_reservationId = fk_reservationId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getFk_cardNumber() {
        return fk_cardNumber;
    }

    public void setFk_cardNumber(String fk_cardNumber) {
        this.fk_cardNumber = fk_cardNumber;
    }

    public String getFk_currency() {
        return fk_currency;
    }

    public void setFk_currency(String fk_currency) {
        this.fk_currency = fk_currency;
    }

    public String getFk_reservationId() {
        return fk_reservationId;
    }

    public void setFk_reservationId(String fk_reservationId) {
        this.fk_reservationId = fk_reservationId;
    }
}

