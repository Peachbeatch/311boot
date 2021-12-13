package com.myapp.demo.dao;

import com.myapp.demo.model.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveRole(Role role) { entityManager.persist(role); }

    @Override
    public Role getRoleByName(String name) {
        return entityManager.createQuery("from Role where name = :name", Role.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    public Role getRoleById(Long id) { return entityManager.find(Role.class, id); }

    @Override
    public List<Role> getAllRoles() { return entityManager.createQuery("from Role", Role.class).getResultList(); }

}
