package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.City;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CityMapper {


    @Select("select * from CITY")
    List<City> selectAllCities();

    @Update("UPDATE CITY set averageTemperature=#{city.averageTemperature} WHERE cityName=#{city.cityName}")
    void updateCity(@Param("city") City city);

    @Insert("INSERT INTO CITY (cityName, averageTemperature, fk_timeZone, fk_currency, fk_countryCode)" +
            "VALUES (#{city.cityName}, #{city.averageTemperature}, #{city.fk_timeZone}, #{city.fk_currency}, #{city.countryCode})")
    void insertCity(@Param("city") City city);

    @Delete("DELETE FROM CITY WHERE cityName=#{city.cityName}")
    void deleteCity(@Param("city") City city);


}
