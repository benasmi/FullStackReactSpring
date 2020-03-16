package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.CardProvider;
import com.springbatis.springbatisboot.Models.City;
import com.springbatis.springbatisboot.Models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CardProviderMapper {

    @Select("select * from CARD_PROVIDER")
    List<CardProvider> selectAll();

}
