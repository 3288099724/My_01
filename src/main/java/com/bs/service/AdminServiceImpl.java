package com.bs.service;

import com.bs.dao.AdminDAO;
import com.bs.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDAO adminDAO;

    @Override
    public boolean login(Admin admin, HttpSession session) {
        System.out.println("service login----------");
        Admin one = adminDAO.queryOne(admin.getName());
        if(one!=null){
            if(one.getPassword().equals(admin.getPassword())){
                System.out.println("login success!");
                session.setAttribute("loginAdmin",one);
                return true;
            }
        }
        return false;
    }
}
