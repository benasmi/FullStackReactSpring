package com.springbatis.springbatisboot.Models;

public class CreditCard {
    public int csv;
    public int expYear;
    public int expMonth;
    public String cardNumber;
    public String fk_email;
    public int fk_cardProvider;

    public CreditCard(int csv, int expYear, int expMonth, String cardNumber, String fk_email, int fk_cardProvider) {
        this.csv = csv;
        this.expYear = expYear;
        this.expMonth = expMonth;
        this.cardNumber = cardNumber;
        this.fk_email = fk_email;
        this.fk_cardProvider = fk_cardProvider;
    }

    public int getCsv() {
        return csv;
    }

    public void setCsv(int csv) {
        this.csv = csv;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public int getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(int expMonth) {
        this.expMonth = expMonth;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFk_email() {
        return fk_email;
    }

    public void setFk_email(String fk_email) {
        this.fk_email = fk_email;
    }

    public int getFk_cardProvider() {
        return fk_cardProvider;
    }

    public void setFk_cardProvider(int fk_cardProvider) {
        this.fk_cardProvider = fk_cardProvider;
    }
}
