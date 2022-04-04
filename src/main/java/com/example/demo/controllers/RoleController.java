package com.example.demo.controllers;

import com.example.demo.models.Role;
import com.example.demo.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
@ResponseBody
public class RoleController {
    private RoleService roleService;
    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }
    @GetMapping("/")
    public List<Role> getAll(){
        return roleService.getAll();
    }
    @GetMapping("/find/{id}")
    public Role find(@PathVariable("id") Long id){
        return roleService.get(id);
    }
    @PutMapping("/update")
    public Role update(@RequestBody Role role){
        return roleService.update(role);
    }
    @PostMapping("/add")
    public Role add(@RequestBody Role role){
        return roleService.add(role);
    }
    @DeleteMapping
    public Boolean delete(@RequestBody Role role){
        return roleService.delete(role);
    }

}
