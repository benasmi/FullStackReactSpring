package com.springbatis.springbatisboot.Controllers;

import com.springbatis.springbatisboot.Mappers.SuggestionMapper;
import com.springbatis.springbatisboot.Models.Suggestion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/suggestion")
public class SuggestionController {

    public SuggestionMapper mapper;

    public SuggestionController(SuggestionMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/all")
    List<Suggestion> getSuggestions(){
        return mapper.selectAll();
    }
}
