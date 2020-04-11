package com.springbatis.springbatisboot.Controllers;


import com.springbatis.springbatisboot.Mappers.CreditCardMapper;
import com.springbatis.springbatisboot.Mappers.UsersMapper;
import com.springbatis.springbatisboot.Models.User;
import com.springbatis.springbatisboot.Models.UserWithCards;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private UsersMapper usersMapper;
    private CreditCardMapper creditCardMapper;

    public UserController(UsersMapper usersMapper, CreditCardMapper creditCardMapper) {
        this.usersMapper = usersMapper;
        this.creditCardMapper = creditCardMapper;
    }

    @ResponseBody
    @GetMapping("/all")
    public List<User> getAll() {
        return usersMapper.findAll();
    }

    @PostMapping("/update")
    public List<User> update(@RequestBody List<User> users){
        for(int i = 0; i<users.size(); i++){
            usersMapper.updateUser(users.get(i));
        }
        return users;
    }

    @PostMapping("/updatewithcards")
    public void updateWithCards(@RequestBody List<UserWithCards> userWithCards){
        for(int i = 0; i<userWithCards.size(); i++){
            usersMapper.updateUser(userWithCards.get(i).user);
            for(int j = 0; j<userWithCards.get(i).cards.size(); j++){
                creditCardMapper.updateCard(userWithCards.get(i).cards.get(j));
            }
        }
    }

    @PostMapping("/insert")
    public List<User> insert(@RequestBody List<User> users){
        for(int i = 0; i<users.size(); i++){
            usersMapper.insertUser(users.get(i));
        }
        return users;
    }

    @PostMapping("/delete")
    public List<User> delete(@RequestBody List<User> users){
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
