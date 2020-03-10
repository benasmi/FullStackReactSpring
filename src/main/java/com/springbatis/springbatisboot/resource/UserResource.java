package com.springbatis.springbatisboot.resource;


import com.springbatis.springbatisboot.mapper.UsersMapper;
import com.springbatis.springbatisboot.model.Users;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
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

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/update")
    public List<Users> update(@RequestBody List<Users> users){
        for(int i = 0; i<users.size(); i++){
            usersMapper.updateUser(users.get(i));
        }
        return users;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/insert")
    public List<Users> insert(@RequestBody List<Users> users){
        for(int i = 0; i<users.size(); i++){
            usersMapper.insertUser(users.get(i));
        }
        return users;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/delete")
    public List<Users> delete(@RequestBody List<Users> users){
        for(int i = 0; i<users.size(); i++){
            usersMapper.deleteUser(users.get(i));
        }
        return users;
    }



//    @GetMapping("/specific/{name}")
//    public Users getSpecific(@PathVariable String name) {
//        return usersMapper.findSpecific(name);
//    }
//    @GetMapping("/specific/")
//    public Users getSpecific2 (@RequestParam("name") String name) {
//        return usersMapper.findSpecific2(name);
//    }


}
