package com.wdjr.springboot.controller;

import com.wdjr.springboot.bean.Result;
import com.wdjr.springboot.bean.User;
import com.wdjr.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value ="/user/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Map<String,Object> map,
                        HttpSession session){

        //核对数据库
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);
        Result login = userService.login(user);
        Object detail = login.getDetail();
        if (detail != null) {
//            登录成功,防止重复提交
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else{
            map.put("msg", "用户名密码错误");
            return "login";
        }

    }
}
