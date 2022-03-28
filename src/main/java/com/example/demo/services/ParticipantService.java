package com.example.demo.services;

import com.example.demo.models.Participant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService implements Services<Participant>{
    @Override
    public List<Participant> getAll() {
        return null;
    }

    @Override
    public Participant get(Long id) {
        return null;
    }

    @Override
    public Participant add(Participant participant) {
        return null;
    }

    @Override
    public Participant update(Participant participant) {
        return null;
    }

    @Override
    public boolean delete(Participant participant) {
        return false;
    }
}
