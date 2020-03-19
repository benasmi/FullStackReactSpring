package com.springbatis.springbatisboot.Models;

public class Suggestion {
    public String placeName;
    public int isFamilyFriendly;
    public String ticketPrice;
    public String imageUrl;
    public int suggestionId;
    public String fk_cityName;

    public Suggestion(String placeName, int isFamilyFriendly, String ticketPrice, String imageUrl, int suggestionId, String fk_cityName) {
        this.placeName = placeName;
        this.isFamilyFriendly = isFamilyFriendly;
        this.ticketPrice = ticketPrice;
        this.imageUrl = imageUrl;
        this.suggestionId = suggestionId;
        this.fk_cityName = fk_cityName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getIsFamilyFriendly() {
        return isFamilyFriendly;
    }

    public void setIsFamilyFriendly(int isFamilyFriendly) {
        this.isFamilyFriendly = isFamilyFriendly;
    }

    public String getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(int suggestionId) {
        this.suggestionId = suggestionId;
    }

    public String getFk_cityName() {
        return fk_cityName;
    }

    public void setFk_cityName(String fk_cityName) {
        this.fk_cityName = fk_cityName;
    }
}

