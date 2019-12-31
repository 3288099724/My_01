package com.bs.controller;

import com.bs.entity.Admin;
import com.bs.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller

public class AdminController {
    @Autowired
    private AdminService adminService;



    @RequestMapping("/login")
    public String login(Admin admin, HttpSession session){
        System.out.println(admin+"---------------------");
        boolean b = adminService.login(admin, session);
        System.out.println(admin+",,,,"+b);
        if(b) {
            session.setAttribute("loginAdmin",admin);
            return "redirect:/show.jsp";
        }
        return "redirect:/login.jsp";
    }


}
