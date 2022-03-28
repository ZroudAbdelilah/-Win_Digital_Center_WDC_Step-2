package com.example.demo.services;

import com.example.demo.models.Activiter;
import com.example.demo.repositories.ActiviterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiviterService implements Services<Activiter> {
    public final ActiviterRepository activiterRepository;
    @Autowired
    public ActiviterService(ActiviterRepository activiterRepository) {
        this.activiterRepository = activiterRepository;
    }

    @Override
    public List<Activiter> getAll() {
        return (List<Activiter>) activiterRepository.findAll();
    }

    @Override
    public Activiter get(Long id) {
        return activiterRepository.findById(id).get();
    }

    @Override
    public Activiter add(Activiter activiter) {
        return activiterRepository.save(activiter);
    }

    @Override
    public Activiter update(Activiter activiter) {
        return activiterRepository.save(activiter);
    }

    @Override
    public boolean delete(Activiter activiter) {
        try {
            activiterRepository.delete(activiter);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
