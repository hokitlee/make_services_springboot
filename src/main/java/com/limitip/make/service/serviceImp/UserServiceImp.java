package com.limitip.make.service.serviceImp;

import com.limitip.make.mapper.UserMapper;
import com.limitip.make.pojo.User;
import com.limitip.make.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: hokitlee
 * Date: 2018/3/19
 * Time: 17:10
 * Description:
 */

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;

    /**新增用户*/
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public Map<String,Serializable> findUserByNameAndPsd(User user) {
        Map<String,Serializable> map = new HashMap<>();
        User rUser;
        String token;
        rUser = userMapper.findByUserNameAndPsd(user);
        if(rUser == null){
            map.put("id","-1");
        }
        else{
            token = rUser.getId()+"key";
            token = DigestUtils.md5DigestAsHex(token.getBytes());
            map.put("id",String.valueOf(rUser.getId()));
            map.put("token", token);
        }
        return map;
    }

    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    public boolean findByUsername(User user) {
        User RUser = userMapper.findByUserName(user);
        Boolean cheakResult = false;
        if(RUser == null){
            return cheakResult = true;
        }
        return cheakResult;
    }
}