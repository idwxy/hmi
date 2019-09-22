package com.idwxy.hmi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.idwxy.hmi.dao")
public class HmiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmiApplication.class, args);
	}

}
