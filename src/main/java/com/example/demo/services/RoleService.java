package com.example.demo.services;

import com.example.demo.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements Services<Role> {
    @Override
    public List<Role> getAll() {
        return null;
    }

    @Override
    public Role get(Long id) {
        return null;
    }

    @Override
    public Role add(Role role) {
        return null;
    }

    @Override
    public Role update(Role role) {
        return null;
    }

    @Override
    public boolean delete(Role role) {
        return false;
    }
}
