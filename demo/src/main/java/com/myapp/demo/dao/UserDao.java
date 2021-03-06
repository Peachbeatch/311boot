package com.myapp.demo.dao;

import com.myapp.demo.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User user);

    User getUserById(Long id);

    User getByName(String name);

    void removeUserById(Long id);

    List<User> getAllUsers();
}
