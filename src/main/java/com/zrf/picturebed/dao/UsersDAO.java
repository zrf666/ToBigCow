package com.zrf.picturebed.dao;

import com.zrf.picturebed.entity.Users;

public interface UsersDAO {
    /**
     * 查找用户
     * @return
     */
    Users getUsers();

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    Users getUserById(int id);

    /**
     * 根据id判断用户是否存在
     * @param id
     * @return
     */
    boolean existsById(int id);

    /**
     * 插入用户
     * @param users
     * @return
     */
    Users insert(Users users);
}
