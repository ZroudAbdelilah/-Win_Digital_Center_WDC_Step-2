package com.example.demo.services;

import com.example.demo.models.ResponsableType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsableTypeService implements Services<ResponsableType> {
    @Override
    public List<ResponsableType> getAll() {
        return null;
    }

    @Override
    public ResponsableType get(Long id) {
        return null;
    }

    @Override
    public ResponsableType add(ResponsableType responsableType) {
        return null;
    }

    @Override
    public ResponsableType update(ResponsableType responsableType) {
        return null;
    }

    @Override
    public boolean delete(ResponsableType responsableType) {
        return false;
    }
}
