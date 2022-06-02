package com.bsg.common;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * gulimall常见应用
 *
 * @author bilib
 * @date 2022/06/02
 */
@SpringBootApplication

public class GulimallCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCommonApplication.class, args);
    }

}
