package com.springbatis.springbatisboot.Models;

public class CardProvider {
    public int id;
    public String provider;


    public CardProvider(int id, String provider) {
        this.id = id;
        this.provider = provider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
