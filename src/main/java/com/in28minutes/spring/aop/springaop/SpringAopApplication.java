package com.in28minutes.spring.aop.springaop;

import com.in28minutes.spring.aop.springaop.business.Business1;
import com.in28minutes.spring.aop.springaop.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.in28minutes.spring.aop.springaop")
public class SpringAopApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private Business1 business1;
	@Autowired
	private Business2 business2;

	public static void main(String[] args) {

		SpringApplication.run(SpringAopApplication.class, args);
		//ConfigurableApplicationContext configurableApplicationContext= SpringApplication.run(SpringApplication.class,args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}
}
