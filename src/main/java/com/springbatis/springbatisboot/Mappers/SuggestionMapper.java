package com.springbatis.springbatisboot.Mappers;

import com.springbatis.springbatisboot.Models.Country;
import com.springbatis.springbatisboot.Models.Currency;
import com.springbatis.springbatisboot.Models.Suggestion;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SuggestionMapper {

    @Select("SELECT * FROM SUGGESTION")
    List<Suggestion> selectAll();

    @Update("UPDATE SUGGESTION set placeName=#{sug.placeName}, isFamilyFriendly=${sug.isFamilyFriendly}, imageUrl=#{sug.imageUrl}, ticketPrice=#{sug.ticketPrice} WHERE suggestionId=#{sug.suggestionId}")
    void updateSuggestion(@Param("sug") Suggestion sug);

    @Delete("DELETE FROM SUGGESTION WHERE suggestionId=#{sug.suggestionId}")
    void deleteSuggestion(@Param("sug") Suggestion sug);

}
