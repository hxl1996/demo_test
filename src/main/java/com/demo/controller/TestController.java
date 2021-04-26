package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping({"/","login"})
    public String index(){
        return "login";
    }


    @RequestMapping(value = "/toLogin")
    public String toLogin(User user){
        String res = userService.findUser(user);
        if(res.equals("success")){
            return "forward:/index";
        }else{
            return "redirect:login";
        }
    }

    @RequestMapping(value = "/index")
    public String toIndex(){
        return "page/index";
    }

    @RequestMapping(value = "/about")
    public String about(){
        return "page/about";
    }

    @RequestMapping(value = "/services")
    public String service(){
        return "page/services";
    }
    @RequestMapping(value = "/contact")
    public String contact(){
        return "page/contact";
    }

    @RequestMapping(value = "/fail")
    public String loginFail(){
        return "user/404";
    }
}
