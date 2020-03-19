package com.springbatis.springbatisboot.Controllers;


import com.springbatis.springbatisboot.Mappers.CurrencyMapper;
import com.springbatis.springbatisboot.Models.Currency;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    public CurrencyMapper mapper;

    public CurrencyController(CurrencyMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/all")
    List<Currency> getAll(){
        return mapper.selectAll();
    }

    @PostMapping("/update")
    void updateCurrency(@RequestBody Currency currency){
        mapper.updateCurrency(currency);
    }

    @PostMapping("/delete")
    void deleteCurrency(@RequestBody Currency currency){
        mapper.deleteCurrency(currency);
    }
}
