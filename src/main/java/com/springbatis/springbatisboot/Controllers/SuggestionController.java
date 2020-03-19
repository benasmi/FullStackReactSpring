package com.springbatis.springbatisboot.Controllers;

import com.springbatis.springbatisboot.Mappers.SuggestionMapper;
import com.springbatis.springbatisboot.Models.Currency;
import com.springbatis.springbatisboot.Models.Suggestion;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/update")
    void updateSuggestion(@RequestBody Suggestion suggestion){
        mapper.updateSuggestion(suggestion);
    }

    @PostMapping("/delete")
    void deleteSuggestion(@RequestBody Suggestion suggestion){
        mapper.deleteSuggestion(suggestion);
    }
}
