package com.example.demo.controllers;

import com.example.demo.models.Responsable;
import com.example.demo.models.ResponsableType;
import com.example.demo.services.ResponsableTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responsabletype")
public class ResponsableTypeController {
    private ResponsableTypeService responsableTypeService;
    @Autowired
    public ResponsableTypeController(ResponsableTypeService responsableTypeService) {
        this.responsableTypeService = responsableTypeService;
    }
    @GetMapping("/")
    public List<ResponsableType> getAll(){
        return responsableTypeService.getAll();
    }
    @GetMapping("/find/{id}")
    public ResponsableType find(@PathVariable("id") Long id){
        return responsableTypeService.get(id);
    }
    @PutMapping("/update/{id}")
    public ResponsableType update(@RequestBody ResponsableType responsableType,@PathVariable("id")Long id){
        return responsableTypeService.update(responsableType);
    }
    @PostMapping("/add")
    public ResponsableType add(@RequestBody ResponsableType responsableType){
        return responsableTypeService.add(responsableType);
    }
    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody ResponsableType responsableType){
        return responsableTypeService.delete(responsableType);
    }
}
