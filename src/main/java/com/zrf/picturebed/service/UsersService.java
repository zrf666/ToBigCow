package com.zrf.picturebed.service;

import com.zrf.picturebed.dao.UsersDAO;
import com.zrf.picturebed.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fafa
 * @version 1.0
 */
@Service
public class UsersService {
    @Autowired
    private UsersDAO usersDAO;

    public Users getUsers(){
        return usersDAO.getUsers();
    }
}
