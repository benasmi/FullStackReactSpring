package com.springbatis.springbatisboot.Models;

public class Currency {
    public String currency;
    public int id;

    public Currency(String currency, int id) {
        this.currency = currency;
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
