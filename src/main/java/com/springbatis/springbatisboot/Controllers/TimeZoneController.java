package com.springbatis.springbatisboot.Controllers;

import com.springbatis.springbatisboot.Mappers.TimeZoneMapper;
import com.springbatis.springbatisboot.Models.TimeZone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/timezone")
public class TimeZoneController {

    public TimeZoneMapper mapper;

    public TimeZoneController(TimeZoneMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/all")
    List<TimeZone> selectAll(){
        return mapper.selectAll();
    }
}
