package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private UserService userService;
    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
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
    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody User user){
        return userService.delete(user);
    }

}
