package com.springbatis.springbatisboot.Controllers;

import com.springbatis.springbatisboot.Mappers.PaymentMapper;
import com.springbatis.springbatisboot.Models.Payment;
import com.springbatis.springbatisboot.Models.ReservationId;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    public PaymentMapper mapper;

    public PaymentController(PaymentMapper mapper) {
        this.mapper = mapper;
    }


    @RequestMapping("/byreservation")
    List<Payment> getPaymentsByReservation(@RequestBody ReservationId id){
        return mapper.selectPaymentByReservationId(id);
    }

}
