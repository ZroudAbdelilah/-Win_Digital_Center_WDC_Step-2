package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List <User> getAll(){
        return userService.getAll();
    }
    @GetMapping("/find/{id}")
    public User find(@PathVariable("id")Long id){
        return userService.get(id);
    }
    @PutMapping("/update")
    public User update(@RequestBody User user){
        return userService.update(user);
    }
    @PostMapping("/add")
    public User add(@RequestBody User user){
        return userService.add(user);
    }
    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable("id")Long id){
        return userService.deleteById(id);
    }

}
