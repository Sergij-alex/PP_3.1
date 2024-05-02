package ru.lukish.springweb.CRUDSpringBoot.service;


import ru.lukish.springweb.CRUDSpringBoot.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> index();
    User show(Long id);
    void update(User updateUser);
    void deleteUser(Long id);
}
