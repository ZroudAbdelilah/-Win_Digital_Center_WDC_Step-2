package com.example.demo.services;

import com.example.demo.models.ResponsableType;
import com.example.demo.repositories.ResponsableTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsableTypeService implements Services<ResponsableType> {
    public final ResponsableTypeRepository responsableTypeRepository;

    @Autowired
    public ResponsableTypeService(ResponsableTypeRepository responsableTypeRepository) {
        this.responsableTypeRepository = responsableTypeRepository;
    }

    @Override
    public List<ResponsableType> getAll() {
        return (List<ResponsableType>) responsableTypeRepository.findAll();
    }

    @Override
    public ResponsableType get(Long id) {
        return responsableTypeRepository.findById(id).get();
    }

    @Override
    public ResponsableType add(ResponsableType responsableType) {
        return responsableTypeRepository.save(responsableType);
    }

    @Override
    public ResponsableType update(ResponsableType responsableType) {
        return responsableTypeRepository.save(responsableType);
    }

    @Override
    public boolean delete(ResponsableType responsableType) {
        try {
            responsableTypeRepository.delete(responsableType);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
