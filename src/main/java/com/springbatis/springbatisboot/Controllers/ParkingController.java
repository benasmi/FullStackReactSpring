package com.springbatis.springbatisboot.Controllers;


import com.springbatis.springbatisboot.Mappers.ParkingMapper;
import com.springbatis.springbatisboot.Models.Parking;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {


    private ParkingMapper mapper;

    public ParkingController(ParkingMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/all")
    List<Parking> parking(){
        return mapper.selectAll();
    }

    @PostMapping("/update")
    void updateParking(@RequestBody Parking body){
        mapper.updateCity(body);
    }

    @GetMapping("/specific/{id}")
    Parking getSpecific(@PathVariable int id) {
        return mapper.findSpecific(id);
    }




}
