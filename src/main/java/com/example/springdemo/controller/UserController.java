package com.example.springdemo.controller;


import com.example.springdemo.domain.User;
import com.example.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    UserService service;  //서비스 객체 의존성 주입

    @GetMapping("/test")
    public String testPage(Model model){
        System.out.println("===============testPage======================");

        List<User> list = service.userList();

        model.addAttribute("list", list);

        return "user/user_list";
    }


}
