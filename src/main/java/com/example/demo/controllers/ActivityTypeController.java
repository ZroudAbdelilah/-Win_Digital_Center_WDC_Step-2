package com.example.demo.controllers;

import com.example.demo.models.ActiviterType;
import com.example.demo.services.ActiviterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activityType")
public class ActivityTypeController {
    private ActiviterTypeService activiterTypeService;
    @Autowired
    public ActivityTypeController(ActiviterTypeService activiterTypeService) {
        this.activiterTypeService = activiterTypeService;
    }
    @GetMapping("/")
    public List<ActiviterType> getAll(){
        return activiterTypeService.getAll();
    }
    @GetMapping("/find/{id}")
    public ActiviterType find(@PathVariable("id")Long id){
        return activiterTypeService.get(id);
    }
    @PutMapping("/update")
    public ActiviterType update(@RequestBody ActiviterType activiterType){
        return activiterTypeService.update(activiterType);
    }
    @PostMapping("/add")
    public ActiviterType add(@RequestBody ActiviterType activiterType){
        return activiterTypeService.add(activiterType);
    }
    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody ActiviterType activiterType){
        return activiterTypeService.delete(activiterType);
    }
}
