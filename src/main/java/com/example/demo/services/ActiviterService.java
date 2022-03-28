package com.example.demo.services;

import com.example.demo.models.Activiter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiviterService implements Services<Activiter> {
    @Override
    public List<Activiter> getAll() {
        return null;
    }

    @Override
    public Activiter get(Long id) {
        return null;
    }

    @Override
    public Activiter add(Activiter activiter) {
        return null;
    }

    @Override
    public Activiter update(Activiter activiter) {
        return null;
    }

    @Override
    public boolean delete(Activiter activiter) {
        return false;
    }
}
