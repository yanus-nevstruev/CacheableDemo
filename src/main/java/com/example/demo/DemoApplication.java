package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import javax.xml.bind.SchemaOutputResolver;

@SpringBootApplication
@EnableCaching
public class DemoApplication {

	public static void main(String[] args) {



		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		TestCacheable testCacheable =  context.getBean(TestCacheable.class);
		testCacheable.call();
		testCacheable.call();

		testCacheable.getFromDb();
		testCacheable.getFromDb();


	}

}
