package com.springbatis.springbatisboot.Controllers;


import com.springbatis.springbatisboot.Mappers.CountryMapper;
import com.springbatis.springbatisboot.Models.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    public CountryMapper mapper;

    public CountryController(CountryMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/all")
    List<Country> selectAll(){
        return mapper.selectAll();
    }

}
