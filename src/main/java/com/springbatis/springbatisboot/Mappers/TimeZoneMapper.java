package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.TimeZone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TimeZoneMapper {

    @Select("select * from TIME_ZONE")
    List<TimeZone> selectAll();

}
