package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.User;
import com.springbatis.springbatisboot.StatiscticsModels.StatiscticsFlightsReqBody;
import com.springbatis.springbatisboot.StatiscticsModels.StatisticsFlightResBody;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StatisticsMapper {

    @Select("SELECT f.flightNumber, HOUR(TIMEDIFF(f.stopDate, f.startDate)) as hourDuration, MINUTE(TIMEDIFF(f.stopDate, f.startDate)) as minuteDuration, r.reservationId,\n" +
            "CONCAT(u.name, ' ' , u.surname) as fullName, u.email, \n" +
            "(SELECT COUNT(c.fk_email) FROM CREDIT_CARD c WHERE c.fk_email = u.email ) as totalDifCardsPerUser,\n" +
            "(SELECT COUNT(*) FROM PAYMENT p WHERE p.fk_reservationId = r.reservationId ) as totalPaymentPerReservation,\n" +
            "(SELECT SUM(p.paymentAmount) FROM PAYMENT p WHERE p.fk_reservationId = r.reservationId ) as totalPaymentSumPerReservation,\n" +
            "(SELECT COUNT(DISTINCT p.fk_cardNumber) FROM PAYMENT p WHERE p.fk_reservationId = r.reservationId ) as totalDifCardsUsedPerReservation\n" +
            "FROM FLIGHT f\n" +
            "INNER JOIN RESERVATION r ON f.flightNumber = r.fk_flightNumber\n" +
            "LEFT JOIN USERS u ON r.fk_email = u.email\n" +
            "WHERE (HOUR(TIMEDIFF(f.stopDate, f.startDate))+MINUTE(TIMEDIFF(f.stopDate, f.startDate))/60 BETWEEN #{req.hourStartBound} AND #{req.hourEndBound})" +
            " AND f.startDate BETWEEN #{req.startDate} AND #{req.stopDate}")
    List<StatisticsFlightResBody> formStatistics(@Param("req") StatiscticsFlightsReqBody req);
}
