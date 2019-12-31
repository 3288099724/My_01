package com.bs.service;

import com.bs.entity.Admin;

import javax.servlet.http.HttpSession;

public interface AdminService {
    boolean login(Admin admin, HttpSession session);
}
