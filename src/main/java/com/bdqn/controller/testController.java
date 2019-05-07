package com.bdqn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    @RequestMapping("/test")
    public String getGod(Model model){
        System.out.println(1111);
        return "index.jsp";
    }
}
