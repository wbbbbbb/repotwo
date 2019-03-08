package com.aaa.ssm.service;

import com.aaa.ssm.dao.UserDao;
import com.aaa.ssm.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * fileName:UserServiceImpl
 * description:
 * author:zz
 * createTime:2019/3/2 16:42
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<Map> getUserList() {
            return userDao.getUserList();
    }
}
