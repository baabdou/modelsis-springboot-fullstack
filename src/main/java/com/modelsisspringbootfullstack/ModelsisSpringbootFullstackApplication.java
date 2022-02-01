package com.modelsisspringbootfullstack;

import com.modelsisspringbootfullstack.entities.AppRole;
import com.modelsisspringbootfullstack.entities.AppUser;
import com.modelsisspringbootfullstack.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ModelsisSpringbootFullstackApplication {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;


	public static void main(String[] args) {
		SpringApplication.run(ModelsisSpringbootFullstackApplication.class, args);
	}

	@Bean
	CommandLineRunner start(AccountService accountService){
		repositoryRestConfiguration.exposeIdsFor(AppUser.class);
		return args -> {
			accountService.saveRole(new AppRole(null,"ADMIN"));

			accountService.saveUser("admin","1234","1234");
			accountService.addRoleToUser("admin","ADMIN");
		};
	}

	@Bean
	BCryptPasswordEncoder getBCPE(){
		return new BCryptPasswordEncoder();
	}

}
