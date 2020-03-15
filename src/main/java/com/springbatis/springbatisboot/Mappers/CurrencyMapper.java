package com.springbatis.springbatisboot.Mappers;


import com.springbatis.springbatisboot.Models.Currency;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CurrencyMapper {

    @Select("select * from CURRENCY")
    List<Currency> selectAll();

}
