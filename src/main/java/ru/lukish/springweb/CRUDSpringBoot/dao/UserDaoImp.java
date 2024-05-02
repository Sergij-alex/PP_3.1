package ru.lukish.springweb.CRUDSpringBoot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.lukish.springweb.CRUDSpringBoot.model.User;

import java.util.List;


@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User show(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> index() {
        return entityManager.createQuery("select p from User p", User.class).getResultList();
    }

    @Override
    public void update(User updateUser) {
        entityManager.merge(updateUser);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.remove(show(id));
    }

}
