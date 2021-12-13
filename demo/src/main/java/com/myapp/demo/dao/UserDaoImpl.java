package com.myapp.demo.dao;

import com.myapp.demo.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) { entityManager.persist(user); }

    @Override
    public void updateUser(User updateUser) { entityManager.merge(updateUser); }

    @Override
    public User getUserById(Long id) { return entityManager.find(User.class,id); }

    @Override
    public User getByName(String name) {
        return entityManager.createQuery("from User where name = :name", User.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    public void removeUserById(Long id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
}
