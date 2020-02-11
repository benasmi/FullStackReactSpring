package com.springbatis.springbatisboot;

import com.springbatis.springbatisboot.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Users.class)
@MapperScan("com.springbatis.springbatisboot.mapper")
@SpringBootApplication
public class SpringbatisBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatisBootApplication.class, args);
	}

}
