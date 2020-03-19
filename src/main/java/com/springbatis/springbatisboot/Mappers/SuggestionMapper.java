package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.Country;
import com.springbatis.springbatisboot.Models.Suggestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SuggestionMapper {

    @Select("select * from SUGGESTION")
    List<Suggestion> selectAll();

}
