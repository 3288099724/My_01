package com.bs.controller;


import com.bs.entity.Supplier;
import com.bs.repository.SupRepository;
import com.bs.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    //@Autowired
    //private SupRepository supRepository;

    @RequestMapping("/add")
    public String add(Supplier supplier){
        System.out.println("add----"+supplier);
        supplier.setId(UUID.randomUUID().toString());
        System.out.println(supplier);
        supplierService.add(supplier);
        return "redirect:/show.jsp";
    }
    @RequestMapping("/delete")
    public String delete(String id){
        System.out.println("delete----"+id);

        supplierService.delete(id);
        return "redirect:/show.jsp";
    }
    @RequestMapping("/update")
    public String update(Supplier supplier){
        System.out.println("update----"+supplier);
        supplierService.update(supplier);
        return "redirect:/show.jsp";
    }

    @RequestMapping("/queryAll")
    public String queryAll(int pageNum, Model m){
        if(pageNum==0) pageNum=1;
        System.out.println("queryAll----pageNum:"+pageNum);
        List<Supplier> supplierList = supplierService.queryAll(pageNum, 5);
        int totalPage = supplierService.totalPages(5);

        m.addAttribute("supplierList",supplierList);
        m.addAttribute("pageNum",pageNum);
        m.addAttribute("totalPage",totalPage);
        return "forward:/supplier.jsp";

    }

/*    //搜索，分页
    @RequestMapping("/queryBy")
    public String queryBy(String by,String content,int pageNum, int pageSize, Model m){

        List<Supplier> supplierList = supRepository.findMatchQuery(by, content,pageNum,pageSize);

        m.addAttribute("supplierList",supplierList);
        return "forward:/supplier.jsp";

    }*/


}
