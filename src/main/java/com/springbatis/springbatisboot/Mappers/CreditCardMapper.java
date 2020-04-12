package com.springbatis.springbatisboot.Mappers;


import com.springbatis.springbatisboot.Models.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CreditCardMapper {

    @Select("select * from CREDIT_CARD where fk_email=#{user}")
    List<CreditCard> findAllForUser(@Param("user") String user);

    @Select("select * from CREDIT_CARD")
    List<CreditCard> getAllByUser();

    @Select("select * from CREDIT_CARD cc where cc.cardNumber in (select DISTINCT(p.fk_cardNumber) from PAYMENT p where p.fk_reservationId=#{reservationId.reservationId})")
    List<CreditCard> getByReservationUser(@Param("reservationId") ReservationId reservationId);

    @Delete("DELETE FROM CREDIT_CARD WHERE cardNumber=#{card.cardNumber}")
    void deleteCard(@Param("card") CreditCard card);

    @Update("UPDATE CREDIT_CARD set csv=#{card.csv}, expYear=#{card.expYear}, expMonth=#{card.expMonth}, fk_cardProvider=#{card.fk_cardProvider} WHERE cardNumber=#{card.cardNumber}")
    void updateCard(@Param("card") CreditCard card);

    @Insert("INSERT INTO CREDIT_CARD (csv,expYear,expMonth,cardNumber, fk_email, fk_cardProvider)" +
            "VALUES (#{card.csv}, #{card.expYear}, #{card.expMonth}, #{card.cardNumber}, #{user.email}, #{card.fk_cardProvider})")
    void insertCreditCard(@Param("user") User user, @Param("card") CreditCard card);

}
