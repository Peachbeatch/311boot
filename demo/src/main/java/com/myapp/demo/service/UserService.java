package com.myapp.demo.service;

import com.myapp.demo.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void updateUser(User user);

    User getUserById(Long id);

    User getByName(String name);

    void removeUserById(Long id);

    List<User> getAllUsers();
}
