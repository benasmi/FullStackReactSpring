package com.springbatis.springbatisboot.Mappers;


import com.springbatis.springbatisboot.Models.Payment;
import com.springbatis.springbatisboot.Models.ReservationId;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PaymentMapper {

    @Select("select * from PAYMENT p where p.fk_reservationId=#{reservationId.reservationId}")
    List<Payment> selectPaymentByReservationId(@Param("reservationId") ReservationId reservationid);
}
