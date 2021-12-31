package com.htd.SpringSecurityWithDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringSecurityWithDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithDatabaseApplication.class, args);
	}

}
