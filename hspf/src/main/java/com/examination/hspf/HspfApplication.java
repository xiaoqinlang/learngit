package com.examination.hspf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.examination.hspf.mbg.mapper")
public class HspfApplication {

    public static void main(String[] args) {
        SpringApplication.run(HspfApplication.class, args);
    }

}
