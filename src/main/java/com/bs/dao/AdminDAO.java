package com.bs.dao;

import com.bs.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDAO {
    Admin queryOne(String name);
}
