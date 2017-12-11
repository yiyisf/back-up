package com.slys.eswitchconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EswitchConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EswitchConfigApplication.class, args);
	}
}
