package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.Currency;
import com.springbatis.springbatisboot.Models.TimeZone;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TimeZoneMapper {

    @Select("select * from TIME_ZONE")
    List<TimeZone> selectAll();

    @Update("UPDATE TIME_ZONE set timeZone=#{tz.timeZone} WHERE id=#{tz.id}")
    void updateTimeZone(@Param("tz") TimeZone tz);

    @Delete("DELETE FROM TIME_ZONE WHERE id=#{tz.id}")
    void deleteTimeZone(@Param("tz") TimeZone tz);

}
