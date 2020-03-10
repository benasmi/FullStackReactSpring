package com.springbatis.springbatisboot.mapper;

import com.springbatis.springbatisboot.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from USERS")
    List<Users> findAll();

    @Update("UPDATE USERS set name=#{user.name} WHERE email=#{user.email}")
    void updateUser(@Param("user") Users user);

    @Insert("INSERT INTO USERS (name, surname, birthday, gender, password, email)" +
            "VALUES (#{user.name}, #{user.surname}, #{user.birthday}, #{user.gender}, #{user.password}, #{user.email})")
    void insertUser(@Param("user") Users user);


//    @Select("select * from users where name=#{name}")
//    Users findSpecific(@Param("name") String name);
//
//    @Select("select * from users where name=#{name}")
//    Users findSpecific2(@Param("name") String name);

}
