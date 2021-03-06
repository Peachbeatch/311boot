package com.myapp.demo.dao;

import com.myapp.demo.model.Role;

import java.util.List;

public interface RoleDao {

    void saveRole(Role role);

    Role getRoleById(Long id);

    Role getRoleByName(String name);

    List<Role> getAllRoles();
}
