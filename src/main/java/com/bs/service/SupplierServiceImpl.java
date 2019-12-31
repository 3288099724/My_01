package com.bs.service;

import com.bs.dao.SupplierDAO;
import com.bs.entity.Supplier;
//import com.bs.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierDAO supplierDAO;
    //@Autowired
   // private SupplierRepository supplierRepository;




    @Override
    public void add(Supplier supplier) {
        supplierDAO.add(supplier);
    }

    @Override
    public void delete(String id) {
      /*  Supplier supplier = new Supplier();
        supplier.setId(id);
        supplierRepository.delete(supplier);*/
      supplierDAO.delete(id);
    }

    //添加索引和更新索引 id 存在更新 不存在添加
    @Override
    public void update(Supplier supplier) {

        //supplierRepository.save(supplier);
        supplierDAO.update(supplier);
    }

  /*  // 搜索查询
    @Override
    public List<Supplier> queryBy(String by, String content, Pageable pageable) {
        List<Supplier> supplierList = new ArrayList<>();
        if("name".equals(by)){
            supplierList = supplierRepository.findByNameLike(content,pageable);
        }else{
            supplierList = supplierRepository.findByLeaderLike(content,pageable);
        }
        return supplierList;
    }*/

/*    @Override
    public List<Supplier> queryAll2(Pageable pageable) {
        List<Supplier> supplierList = supplierRepository.findAll2(pageable);
        return supplierList;
    }*/

    @Override
    public List<Supplier> queryAll(int pageNum, int pageSize) {
        int begin = (pageNum-1)* pageSize+1;
        int end = pageNum*pageSize;
        return supplierDAO.queryAll(begin,end);
    }

    @Override
    public int totalRecords() {
        return supplierDAO.count().size();
    }

    @Override
    public int totalPages(int pageSize) {
        int totalRecords = supplierDAO.count().size();

        int totalPages = totalRecords%pageSize == 0? (totalRecords/pageSize):(totalRecords/pageSize)+1;
        return totalPages;
    }
}
