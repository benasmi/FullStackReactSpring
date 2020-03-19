package com.springbatis.springbatisboot.Controllers;


import com.springbatis.springbatisboot.Mappers.CountryMapper;
import com.springbatis.springbatisboot.Models.Country;
import com.springbatis.springbatisboot.Models.TimeZone;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/update")
    void updateCountry(@RequestBody Country country){
        mapper.updateCountry(country);
    }

    @PostMapping("/delete")
    void deleteCountry(@RequestBody Country country){
        mapper.deleteCountry(country);
    }
}
