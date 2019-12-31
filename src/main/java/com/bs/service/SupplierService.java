package com.bs.service;

import com.bs.entity.Supplier;
//import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SupplierService {
    void add(Supplier supplier);
    void delete(String id);
    void update(Supplier supplier);


    //查询所有，分页
    //List<Supplier> queryAll2(Pageable pageable);



    //分页
    List<Supplier> queryAll(int pageNum, int pageSize);
    int totalRecords();
    int totalPages(int pageSize);
}
