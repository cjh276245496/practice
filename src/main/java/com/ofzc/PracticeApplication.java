package com.ofzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: cjh27
 * @Date: 2019/2/14
 */

@EnableTransactionManagement
@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {

        SpringApplication.run(PracticeApplication.class,args);
    }

}
