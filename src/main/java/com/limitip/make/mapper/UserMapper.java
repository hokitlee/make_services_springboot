package com.limitip.make.mapper;


import com.limitip.make.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: hokitlee
 * Date: 2018/3/19
 * Time: 16:53
 * Description:用户信息对象持久化映射层
 */

public interface UserMapper {
    /**新增*/
    void addUser(User user);
    User findByUserNameAndPsd(User user);
    List<User> findAllUser();
    User findByUserName(User user);
}