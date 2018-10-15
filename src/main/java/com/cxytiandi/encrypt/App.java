package com.cxytiandi.encrypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cxytiandi.encrypt.anno.EnableEncrypt;

/**
 * 加解密测试
 * 
 * yinjihuan
 *
 */
@SpringBootApplication
@EnableEncrypt  //在启动类上增加@EnableEncrypt注解开启加解密操作
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
