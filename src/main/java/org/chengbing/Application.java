package org.chengbing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Harold澂冰
 * @Date: 2021/6/19 11:26
 */
@SpringBootApplication
@MapperScan("org.chengbing.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
