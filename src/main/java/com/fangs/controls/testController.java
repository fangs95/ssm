package com.fangs.controls;

import com.alibaba.fastjson.JSONObject;
import com.fangs.dao.UserDao;
import com.fangs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test/{loginname}")
    public @ResponseBody
    String test(@PathVariable("loginname")String loginname){
        String username = userService.getUserByLoginname(loginname);
        return username+"你好";
    }

    @RequestMapping("/test1/{loginname}")
    public JSONObject test1(@PathVariable("loginname")String loginname){
        String username = userService.getUserByLoginname(loginname);
        JSONObject a = new JSONObject();
        a.put("1",username+"你好");
        return a;
    }


}
