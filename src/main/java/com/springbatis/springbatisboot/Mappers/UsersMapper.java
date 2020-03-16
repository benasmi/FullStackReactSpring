package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from USERS")
    List<User> findAll();

    @Update("UPDATE USERS set name=#{user.name} WHERE email=#{user.email}")
    void updateUser(@Param("user") User user);

    @Insert("INSERT INTO USERS (name, surname, birthday, gender, password, email, fk_country)" +
            "VALUES (#{user.name}, #{user.surname}, #{user.birthday}, #{user.gender}, #{user.password}, #{user.email}, #{user.fk_country})")
    void insertUser(@Param("user") User user);

    @Delete("DELETE FROM USERS WHERE email=#{user.email}")
    void deleteUser(@Param("user") User user);

//    @Select("select * from users where name=#{name}")
//    Users findSpecific(@Param("name") String name);
//
//    @Select("select * from users where name=#{name}")
//    Users findSpecific2(@Param("name") String name);

}
