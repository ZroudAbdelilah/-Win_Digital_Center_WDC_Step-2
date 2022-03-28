package com.example.demo.services;

import com.example.demo.models.Responsable;
import com.example.demo.repositories.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsableService implements Services <Responsable> {
    private final ResponsableRepository responsableRepository;
    @Autowired
    public ResponsableService(ResponsableRepository responsableRepository) {
        this.responsableRepository = responsableRepository;
    }

    @Override
    public List<Responsable> getAll() {
        return (List<Responsable>) responsableRepository.findAll();
    }

    @Override
    public Responsable get(Long id) {
        return responsableRepository.findById(id).get();
    }

    @Override
    public Responsable add(Responsable responsable) {
        return responsableRepository.save(responsable);
    }

    @Override
    public Responsable update(Responsable responsable) {
        return responsableRepository.save(responsable);
    }

    @Override
    public boolean delete(Responsable responsable) {
        try {
            responsableRepository.delete(responsable);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }

    }
}
