package com.springbatis.springbatisboot.Controllers;


import com.springbatis.springbatisboot.Mappers.CardProviderMapper;
import com.springbatis.springbatisboot.Models.CardProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cardprovider")
public class CardProviderController {

    public CardProviderMapper mapper;

    public CardProviderController(CardProviderMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/all")
    List<CardProvider> selectAll(){
        return mapper.selectAll();
    }
}
