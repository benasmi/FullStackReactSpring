package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.Country;
import com.springbatis.springbatisboot.Models.Currency;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CountryMapper {

    @Select("select * from COUNTRY")
    List<Country> selectAll();

    @Update("UPDATE COUNTRY SET country=#{country.country}, countryCode=#{country.countryCode} WHERE numericCode=#{country.numericCode}")
    void updateCountry(@Param("country") Country country);

    @Delete("DELETE FROM COUNTRY WHERE numericCode=#{country.numericCode}")
    void deleteCountry(@Param("country") Country country);

}
