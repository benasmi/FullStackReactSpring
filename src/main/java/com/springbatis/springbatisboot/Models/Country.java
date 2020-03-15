package com.springbatis.springbatisboot.Models;

public class Country {
    public String country;
    public String countryCode;
    public int numericCode;

    public Country(String country, String countryCode, int numericCode) {
        this.country = country;
        this.countryCode = countryCode;
        this.numericCode = numericCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(int numericCode) {
        this.numericCode = numericCode;
    }
}
