package com.bs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//指定dao接口所在的包结构
@MapperScan("com.bs.dao")

public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    public void test() {
        System.out.println("hahah");
    }
}
