package com.example.mytest.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.security.RunAs;

@Component
@Order(1)
public class MyCommandLineRunnerTwo implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 MyStartupRunner2 order 1 <<<<<<<<<<<<<");

        new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException();
            }
        }).start();


    }
}
