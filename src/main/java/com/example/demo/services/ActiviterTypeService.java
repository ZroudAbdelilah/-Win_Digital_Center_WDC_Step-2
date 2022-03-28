package com.example.demo.services;

import com.example.demo.models.ActiviterType;
import com.example.demo.repositories.ActiviterTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiviterTypeService implements Services<ActiviterType> {
    public final ActiviterTypeRepository activiterTypeRepository;
    @Autowired
    public ActiviterTypeService(ActiviterTypeRepository activiterTypeRepository) {
        this.activiterTypeRepository = activiterTypeRepository;
    }

    @Override
    public List<ActiviterType> getAll() {
        return (List<ActiviterType>) activiterTypeRepository.findAll();
    }

    @Override
    public ActiviterType get(Long id) {
        return activiterTypeRepository.findById(id).get();
    }

    @Override
    public ActiviterType add(ActiviterType activiterType) {
        return activiterTypeRepository.save(activiterType);
    }

    @Override
    public ActiviterType update(ActiviterType activiterType) {
        return activiterTypeRepository.save(activiterType);
    }

    @Override
    public boolean delete(ActiviterType activiterType) {
        try {
            activiterTypeRepository.delete(activiterType);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
