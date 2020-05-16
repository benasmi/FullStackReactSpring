package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.City;
import com.springbatis.springbatisboot.Models.Currency;
import com.springbatis.springbatisboot.Models.Parking;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ParkingMapper {
    @Select("select * from PARKING")
    List<Parking> selectAll();

    @Update("UPDATE PARKING set name=#{parking.name} WHERE id=#{parking.id}")
    void updateCity(@Param("parking") Parking parking);

    @Select("select * from PARKING where id=#{id}")
    Parking findSpecific(@Param("id") int id);
}
