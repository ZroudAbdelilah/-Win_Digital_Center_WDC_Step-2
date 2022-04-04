package com.example.demo.controllers;

import com.example.demo.models.Responsable;
import com.example.demo.services.ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responsable")
public class ResponsableController {
    private ResponsableService responsableService;
    @Autowired

    public ResponsableController(ResponsableService responsableService) {
        this.responsableService = responsableService;
    }
    @GetMapping("/")
    public List<Responsable> getAll(){
        return responsableService.getAll();
    }
    @GetMapping("/find/{id}")
    public Responsable find(@PathVariable("id") Long id){
        return responsableService.get(id);
    }
    @PutMapping("/update/{id}")
    public Responsable update(@RequestBody Responsable responsable,@PathVariable("id") Long id){
        return responsableService.update(responsable);
    }
    @PostMapping("/add")
    public Responsable add(@RequestBody Responsable responsable){
        return responsableService.add(responsable);
    }
    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Responsable responsable){
        return  responsableService.delete(responsable);
    }
}
