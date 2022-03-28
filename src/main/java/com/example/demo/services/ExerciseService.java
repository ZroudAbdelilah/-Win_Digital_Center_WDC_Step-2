package com.example.demo.services;

import com.example.demo.models.Exercise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService implements Services<Exercise> {
    @Override
    public List<Exercise> getAll() {
        return null;
    }

    @Override
    public Exercise get(Long id) {
        return null;
    }

    @Override
    public Exercise add(Exercise exercise) {
        return null;
    }

    @Override
    public Exercise update(Exercise exercise) {
        return null;
    }

    @Override
    public boolean delete(Exercise exercise) {
        return false;
    }
}
