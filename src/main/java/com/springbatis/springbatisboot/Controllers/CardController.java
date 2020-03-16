package com.springbatis.springbatisboot.Controllers;

import com.springbatis.springbatisboot.Mappers.CreditCardMapper;
import com.springbatis.springbatisboot.Models.CreditCard;
import com.springbatis.springbatisboot.Models.User;
import com.springbatis.springbatisboot.Models.UserWithCards;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    public CreditCardMapper mapper;

    public CardController(CreditCardMapper mapper) {
        this.mapper = mapper;
    }

    @PostMapping("/usercards")
    List<CreditCard> allUserCards(@RequestBody User user){
        return mapper.findAllForUser(user);
    }

    @PostMapping("/insert")
    List<CreditCard> insertCardsForUser(@RequestBody UserWithCards cardsUser){
        for(int i = 0; i<cardsUser.cards.size(); i++){
            mapper.insertCreditCard(cardsUser.user,cardsUser.cards.get(i));
        }
        return cardsUser.cards;
    }
}
