package com.myapp.demo.service;

import com.myapp.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    void saveRole(Role role);

    Role getRoleById(Long id);

    Role getRoleByName(String name);

    List<Role> getAllRoles();

    Set<Role> checkRoles(String[] setOfRoles);

    Set<Role> getSetOfRoles(String[] roles);
}
