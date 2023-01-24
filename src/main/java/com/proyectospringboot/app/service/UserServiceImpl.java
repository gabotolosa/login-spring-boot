package com.proyectospringboot.app.service;

import com.proyectospringboot.app.entity.User;
import com.proyectospringboot.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository repository;

    @Override
    public Iterable<User> getAllUsers() {

        return repository.findAll();
    }
}
