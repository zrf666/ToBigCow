package com.zrf.picturebed.dao.impl;

import com.zrf.picturebed.dao.UsersDAO;
import com.zrf.picturebed.entity.Users;
import com.zrf.picturebed.repository.UsersRepository;
import com.zrf.picturebed.utils.Sex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author fafa
 * @version 1.0
 */
@Repository
public class UsersDAOImpl implements UsersDAO {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users getUsers() {
        return new Users(1, "fafa", Sex.MAN, "123433");
    }

    @Override
    public Users getUserById(int id) {
        return usersRepository.findById(id).get();
    }

    @Override
    public boolean existsById(int id) {
        return usersRepository.existsById(id);
    }

    /**
     * 增加用户
     * @return
     */
    @Override
    public Users insert(Users users) {
        return usersRepository.save(users);

    }
}
