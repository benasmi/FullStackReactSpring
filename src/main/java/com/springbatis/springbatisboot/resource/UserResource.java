package com.springbatis.springbatisboot.resource;


import com.springbatis.springbatisboot.mapper.UsersMapper;
import com.springbatis.springbatisboot.model.Users;
import org.apache.catalina.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private UsersMapper usersMapper;

    public UserResource(UsersMapper mapper){
        usersMapper = mapper;
    }


    @ResponseBody
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/all")
    public List<Users> getAll() {
        return usersMapper.findAll();
    }
    @GetMapping("/specific/{name}")
    public Users getSpecific(@PathVariable String name) {
        return usersMapper.findSpecific(name);
    }
    @GetMapping("/specific/")
    public Users getSpecific2 (@RequestParam("name") String name) {
        return usersMapper.findSpecific2(name);
    }


}
