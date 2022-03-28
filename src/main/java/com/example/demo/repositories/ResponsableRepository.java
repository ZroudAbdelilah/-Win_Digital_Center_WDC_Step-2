package com.example.demo.repositories;

import com.example.demo.models.Responsable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepository extends CrudRepository<Responsable,Long> {
    public Responsable findFirstByEmail(String email);
}
