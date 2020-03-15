package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.Country;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CountryMapper {

    @Select("select * from COUNTRY")
    List<Country> selectAll();

}
