package com.springbatis.springbatisboot.Controllers;

import com.springbatis.springbatisboot.Mappers.CreditCardMapper;
import com.springbatis.springbatisboot.Mappers.UsersMapper;
import com.springbatis.springbatisboot.Models.CreditCard;
import com.springbatis.springbatisboot.Models.ReservationId;
import com.springbatis.springbatisboot.Models.User;
import com.springbatis.springbatisboot.Models.UserWithCards;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cards")
public class CardController {

    public CreditCardMapper mapper;
    public UsersMapper usersMapper;

    public CardController(CreditCardMapper mapper, UsersMapper usersMapper) {
        this.mapper = mapper;
        this.usersMapper = usersMapper;
    }


    @PostMapping("/usercards")
    List<CreditCard> allUserCards(@RequestBody String email){
        return mapper.findAllForUser(email);
    }

    @PostMapping("/insert")
    void insertCardsForUser(@RequestBody List<UserWithCards> cardsUser){
        for(int x = 0; x<cardsUser.size(); x++){
            usersMapper.insertUser(cardsUser.get(x).user);
            for(int i = 0; i<cardsUser.get(x).cards.size(); i++){
                mapper.insertCreditCard(cardsUser.get(x).user,cardsUser.get(x).cards.get(i));
            }
        }
    }

    @PostMapping("/byreservation")
    @ResponseBody
    List<CreditCard> cardsByReservation(@RequestBody ReservationId id){
        return mapper.getByReservationUser(id);
    }

    @GetMapping("/all")
    Map<String, List<CreditCard>> getAll(){
        List<CreditCard> cards = mapper.getAllByUser();
        return cards.stream().collect(Collectors.groupingBy(CreditCard::getFk_email));
    }

    @PostMapping("/remove")
    void remove(@RequestBody CreditCard card){
        mapper.deleteCard(card);
    }

    @PostMapping("/update")
    void update(@RequestBody List<CreditCard> cards){
        for (CreditCard c: cards) {
            mapper.updateCard(c);
        }
    }

}
