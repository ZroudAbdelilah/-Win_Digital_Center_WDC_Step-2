package com.example.demo.repositories;

import com.example.demo.models.ActiviterType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiviterTypeRepository extends CrudRepository<ActiviterType,Long> {
}
