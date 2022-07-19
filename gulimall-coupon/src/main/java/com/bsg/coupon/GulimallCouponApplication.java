package com.bsg.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * nacos作为配置中心
 * 引入依赖
 * 创建bootstrap.properties文件 写入配置信息
 * 给配置中心添加一个莫尔纳的数据集dataid gulimall-coupon.properties 就是nacos的配置文件
 * @RefreshScope 动态刷新配置同步服务器的配置信息 你在哪里用到了读取配置的写在哪
 * @value("#{xxx}")
 */
@SpringBootApplication
@EnableDiscoveryClient

public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
