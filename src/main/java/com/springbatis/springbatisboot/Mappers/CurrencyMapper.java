package com.springbatis.springbatisboot.Mappers;


import com.springbatis.springbatisboot.Models.City;
import com.springbatis.springbatisboot.Models.Currency;
import com.springbatis.springbatisboot.Models.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface CurrencyMapper {

    @Select("select * from CURRENCY")
    List<Currency> selectAll();

    @Update("UPDATE CURRENCY set currency=#{currency.currency} WHERE id=#{currency.id}")
    void updateCurrency(@Param("currency") Currency currency);

    @Delete("DELETE FROM CURRENCY WHERE id=#{currency.id}")
    void deleteCurrency(@Param("currency") Currency currency);
}
