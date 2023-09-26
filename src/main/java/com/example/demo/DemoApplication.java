package com.example.demo;

import com.example.demo.plugin.Cat;
import com.example.demo.service.IActivityModelHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.config.EnablePluginRegistries;

/**
 * @author kermit.mo
 */
@EnablePluginRegistries(value = {IActivityModelHandler.class, Cat.class})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
