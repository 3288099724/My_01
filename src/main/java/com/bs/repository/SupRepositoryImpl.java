package com.bs.repository;

import java.util.List;


/*
public class SupRepositoryImpl implements SupRepository {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


    // 根据指定的条件字段查询，同时进行分页
    @Override
    public List<Supplier> findMatchQuery(String field, String content, int page, int size) {
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withIndices("supplier")
                .withTypes("s")
                .withQuery(QueryBuilders.matchQuery(field,content))
                .withPageable(PageRequest.of(page-1,size))
                .build();
        //
        List<Supplier> supplierList = elasticsearchTemplate.queryForList(searchQuery, Supplier.class);
        return supplierList;
    }

}

*/
