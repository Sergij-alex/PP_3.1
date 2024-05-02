package ru.lukish.springweb.CRUDSpringBoot.dao;


import ru.lukish.springweb.CRUDSpringBoot.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    List<User> index();
    User show(Long id);
    void update(User updateUser);
    void deleteUser(Long id);
}
