package com.limitip.make.service;

import com.limitip.make.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * User: hokitlee
 * Date: 2018/3/19
 * Time: 17:08
 * Description:
 */
public interface UserService {
    void addUser(User user);
    Map findUserByNameAndPsd(User user);
    List<User> findAllUser();
    boolean findByUsername(User user);
}