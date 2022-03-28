package com.example.demo.repositories;

import com.example.demo.models.ResponsableType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableTypeRepository extends CrudRepository<ResponsableType,Long> {
}
