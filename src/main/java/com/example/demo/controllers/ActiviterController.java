package com.example.demo.controllers;

import com.example.demo.models.Activiter;
import com.example.demo.services.ActiviterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activiter")
@CrossOrigin("*")
public class ActiviterController {
    private ActiviterService activiterService;
    @Autowired
    public ActiviterController(ActiviterService activiterService) {
        this.activiterService = activiterService;
    }
    @GetMapping("/")
    public List<Activiter> getAll(){
        return activiterService.getAll();
    }
    @GetMapping("/find/{id}")
    public Activiter find(@PathVariable("id")Long id){
        return activiterService.get(id);
    }
    @PutMapping("/update")
    public Activiter update(@RequestBody Activiter activiter){
        return activiterService.update(activiter);
    }
    @PostMapping("/add")
    public Activiter add(@RequestBody Activiter activiter){
        return activiterService.add(activiter);
    }
    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Activiter activiter){
        return activiterService.delete(activiter);
    }
}
