package com.wenz.demo.service;

import com.wenz.demo.entity.UserBean;
import com.wenz.demo.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author wenz~
 */
@Service
public class UserService {
    //将dao层属性注入service层
    @Resource
    private UserMapper userMapper;

    public UserBean LoginIn(String username, String password) {
        return userMapper.getInfo(username,password);
    }

    public void Insert(String username,String password){
        userMapper.saveInfo(username, password);
    }
}



