package com.springbatis.springbatisboot.Controllers;


import com.springbatis.springbatisboot.Mappers.CityMapper;
import com.springbatis.springbatisboot.Mappers.UsersMapper;
import com.springbatis.springbatisboot.Models.City;
import com.springbatis.springbatisboot.Models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    private CityMapper cityMapper;

    public CityController(CityMapper mapper){
        cityMapper = mapper;
    }

    @ResponseBody
    @GetMapping("/all")
    List<City> cityList(){
        return cityMapper.selectAllCities();
    }

    @PostMapping("/update")
    public List<City> update(@RequestBody List<City> cities){
        for(int i = 0; i<cities.size(); i++){
            cityMapper.updateCity(cities.get(i));
        }
        return cities;
    }

    @PostMapping("/insert")
    public List<City> insert(@RequestBody List<City> cities){
        for(int i = 0; i<cities.size(); i++){
            cityMapper.insertCity(cities.get(i));
        }
        return cities;
    }

    @PostMapping("/delete")
    public List<City> delete(@RequestBody List<City> cities){
        for(int i = 0; i<cities.size(); i++){
            cityMapper.deleteCity(cities.get(i));
        }
        return cities;
    }

}
