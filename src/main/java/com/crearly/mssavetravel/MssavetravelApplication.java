package com.crearly.mssavetravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class MssavetravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MssavetravelApplication.class, args);
	}

}
