package com.example.demo.services;

import com.example.demo.models.Exercise;
import com.example.demo.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService implements Services<Exercise> {
    public final ExerciseRepository exerciseRepository;
    @Autowired
    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public List<Exercise> getAll() {
        return (List<Exercise>) exerciseRepository.findAll();
    }

    @Override
    public Exercise get(Long id) {
        return exerciseRepository.findById(id).get();
    }

    @Override
    public Exercise add(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public Exercise update(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public boolean delete(Exercise exercise) {
        try {
            exerciseRepository.delete(exercise);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
