package com.springbatis.springbatisboot.Controllers;

import com.springbatis.springbatisboot.Mappers.TimeZoneMapper;
import com.springbatis.springbatisboot.Models.Suggestion;
import com.springbatis.springbatisboot.Models.TimeZone;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/update")
    void updateTimeZone(@RequestBody TimeZone timeZone){
        mapper.updateTimeZone(timeZone);
    }

    @PostMapping("/delete")
    void deleteCurrency(@RequestBody TimeZone timeZone){
        mapper.deleteTimeZone(timeZone);
    }
}
