package com.example.demo.controllers;

import com.example.demo.models.Participant;
import com.example.demo.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participant")
@ResponseBody
public class ParticipantController {
    private ParticipantService participantService;
    @Autowired
    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }
    @GetMapping("/")
    public List<Participant> getAll(){
        return participantService.getAll();
    }
    @GetMapping("/find/{id}")
    public Participant find(@PathVariable("id") Long id ){
        return participantService.get(id);
    }
    @PutMapping("/update/{id}")
    public Participant update(@RequestBody Participant participant){
        return participantService.update(participant);
    }
    @PostMapping("/add")
    public Participant add(@RequestBody Participant participant){
        return participantService.add(participant);
    }
    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Participant participant){
        return participantService.delete(participant);
    }
}
