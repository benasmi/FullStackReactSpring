package com.springbatis.springbatisboot.Mappers;


import com.springbatis.springbatisboot.Models.City;
import com.springbatis.springbatisboot.Models.CreditCard;
import com.springbatis.springbatisboot.Models.User;
import com.springbatis.springbatisboot.Models.UserWithCards;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper
public interface CreditCardMapper {

    @Select("select * from CREDIT_CARD where fk_email=#{user.email}")
    List<CreditCard> findAllForUser(@Param("user") User user);

    @Select("select * from CREDIT_CARD")
    List<CreditCard> getAllByUser();


    @Update("UPDATE CREDIT_CARD set csv=#{card.csv}, expYear=#{card.expYear}, expMonth=#{card.expMonth} cardNumber=#{card.cardNumber} fk_cardProvider=#{card.fk_cardProvider} WHERE cardNumber=#{card.cardNumber}")
    void updateCard(@Param("city") CreditCard card);

    @Insert("INSERT INTO CREDIT_CARD (csv,expYear,expMonth,cardNumber, fk_email, fk_cardProvider)" +
            "VALUES (#{card.csv}, #{card.expYear}, #{card.expMonth}, #{card.cardNumber}, #{user.email}, #{card.fk_cardProvider})")
    void insertCreditCard(@Param("user") User user, @Param("card") CreditCard card);

}
