package com.springbatis.springbatisboot.Models;

public class City {

    public String cityName;
    public String averageTemperature;
    public String fk_currency;
    public String fk_countryCode;
    public String fk_timeZone;

    public City(String cityName, String averageTemperature, String fk_currency, String fk_countryCode, String fk_timeZone) {
        this.cityName = cityName;
        this.averageTemperature = averageTemperature;
        this.fk_currency = fk_currency;
        this.fk_countryCode = fk_countryCode;
        this.fk_timeZone = fk_timeZone;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(String averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getFk_currency() {
        return fk_currency;
    }

    public void setFk_currency(String fk_currency) {
        this.fk_currency = fk_currency;
    }

    public String getFk_countryCode() {
        return fk_countryCode;
    }

    public void setFk_countryCode(String fk_countryCode) {
        this.fk_countryCode = fk_countryCode;
    }

    public String getFk_timeZone() {
        return fk_timeZone;
    }

    public void setFk_timeZone(String fk_timeZone) {
        this.fk_timeZone = fk_timeZone;
    }
}
