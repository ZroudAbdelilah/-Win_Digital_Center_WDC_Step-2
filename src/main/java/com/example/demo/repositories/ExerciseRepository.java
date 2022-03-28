package com.example.demo.repositories;

import com.example.demo.models.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends CrudRepository<Exercise,Long> {

}
