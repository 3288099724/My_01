package com.bs.repository;

import com.bs.entity.Supplier;

import java.util.List;

public interface SupRepository {
    // 根据指定的条件字段查询，同时进行分页和排序
    List<Supplier> findMatchQuery(String field, String content, int page, int size);
}
