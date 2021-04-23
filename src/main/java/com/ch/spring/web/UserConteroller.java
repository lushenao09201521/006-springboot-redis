package com.ch.spring.web;

import com.ch.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserConteroller {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/put")
    @ResponseBody
    public Object put(String key, String value) {
        userService.put(key, value);

        return "Redis数据";
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public String get() {
        String count = userService.get("count");

        return "数据值:" + count;
    }
}
