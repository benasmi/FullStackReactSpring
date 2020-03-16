package com.springbatis.springbatisboot.Mappers;


import com.springbatis.springbatisboot.Models.CreditCard;
import com.springbatis.springbatisboot.Models.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper
public interface CreditCardMapper {

    @Select("select * from CREDIT_CARD where fk_email=#{user.email}")
    List<CreditCard> findAllForUser(@Param("user") User user);

    @Insert("INSERT INTO CREDIT_CARD (csv,expYear,expMonth,cardNumber, fk_email, fk_cardProvider)" +
            "VALUES (#{card.csv}, #{card.expYear}, #{card.expMonth}, #{card.cardNumber}, #{user.email}, #{card.fk_cardProvider})")
    void insertCreditCard(@Param("user") User user, @Param("card") CreditCard card);

}
