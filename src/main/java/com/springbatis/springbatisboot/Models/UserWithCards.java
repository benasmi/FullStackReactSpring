package com.springbatis.springbatisboot.Models;

import java.util.List;

public class UserWithCards {
    public User user;
    public List<CreditCard> cards;

    public UserWithCards(User user, List<CreditCard> cards) {
        this.user = user;
        this.cards = cards;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<CreditCard> getCards() {
        return cards;
    }

    public void setCards(List<CreditCard> cards) {
        this.cards = cards;
    }
}
