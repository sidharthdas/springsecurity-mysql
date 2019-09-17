package com.springsecuritymysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class SpringsecurityMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityMysqlApplication.class, args);
	}

}
