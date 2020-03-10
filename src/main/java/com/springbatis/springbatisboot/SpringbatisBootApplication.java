package com.springbatis.springbatisboot;

import com.springbatis.springbatisboot.model.Params;
import com.springbatis.springbatisboot.model.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Params.class)
@MapperScan("com.springbatis.springbatisboot.mapper")
@SpringBootApplication
public class SpringbatisBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatisBootApplication.class, args);
	}

}
