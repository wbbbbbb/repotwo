package com.aaa.ssm.controller;

import com.aaa.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * fileName:UserController
 * description:
 * author:zz
 * createTime:2019/3/2 16:44
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * user list
     * @return
     */
    @ResponseBody
    @RequestMapping("/list")
    public Object list(){
        List<Map> userList = userService.getUserList();
        Map map = new HashMap();
        map.put("ip","18.30");
        userList.add(map);
        return userList;
    }
}
