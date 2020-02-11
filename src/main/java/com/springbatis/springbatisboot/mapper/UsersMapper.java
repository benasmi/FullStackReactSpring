package com.springbatis.springbatisboot.mapper;

import com.springbatis.springbatisboot.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsersMapper {
    @Select("select * from AIRPLANES")
    List<Users> findAll();

    @Select("select * from users where name=#{name}")
    Users findSpecific(@Param("name") String name);

    @Select("select * from users where name=#{name}")
    Users findSpecific2(@Param("name") String name);
}
