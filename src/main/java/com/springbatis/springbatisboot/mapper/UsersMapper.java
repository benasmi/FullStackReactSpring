package com.springbatis.springbatisboot.mapper;

import com.springbatis.springbatisboot.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {
    @Select("select * from USERS")
    List<Users> findAll();

    @Update("update USERS set name=#{user.name} where email=#{user.email}")
    void updateUser(@Param("user") Users user);

    @Select("select * from users where name=#{name}")
    Users findSpecific(@Param("name") String name);

    @Select("select * from users where name=#{name}")
    Users findSpecific2(@Param("name") String name);

}
