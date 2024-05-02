package ru.lukish.springweb.CRUDSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.lukish.springweb.CRUDSpringBoot.dao.UserDao;
import ru.lukish.springweb.CRUDSpringBoot.model.User;

import java.util.List;


@Service
@Transactional
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly=true)
    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User show(Long id) {
        return userDao.show(id);
    }

    @Override
    public void update(User updateUser) {
        userDao.update(updateUser);
    }

    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }


}
