package com.bs.dao;

import com.bs.entity.Supplier;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierDAO {
    void add(Supplier supplier);
    void delete(String id);
    void update(Supplier supplier);

    List<Supplier> queryAll(@Param("begin") int begin, @Param("end") int end);
    List<Supplier> count();

}
