package com.solstice.doherty.ribbontimeapp;

import com.solstice.doherty.ribbontimeapp.config.RibbonTimeConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "time-service", configuration = RibbonTimeConfig.class)
public class RibbonTimeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonTimeAppApplication.class, args);
	}
}
