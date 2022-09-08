package com.zrf.picturebed.dao.impl;

import com.zrf.picturebed.dao.UsersDAO;
import com.zrf.picturebed.entity.Users;
import com.zrf.picturebed.utils.Sex;
import org.springframework.stereotype.Repository;

/**
 * @author fafa
 * @version 1.0
 */
@Repository
public class UsersDAOImpl implements UsersDAO {
    @Override
    public Users getUsers() {
        return new Users(1, "fafa", Sex.MAN, "123433");
    }
}
