package com.example.demo.services;

import com.example.demo.models.ActiviterType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiviterTypeService implements Services<ActiviterType> {
    @Override
    public List<ActiviterType> getAll() {
        return null;
    }

    @Override
    public ActiviterType get(Long id) {
        return null;
    }

    @Override
    public ActiviterType add(ActiviterType activiterType) {
        return null;
    }

    @Override
    public ActiviterType update(ActiviterType activiterType) {
        return null;
    }

    @Override
    public boolean delete(ActiviterType activiterType) {
        return false;
    }
}
