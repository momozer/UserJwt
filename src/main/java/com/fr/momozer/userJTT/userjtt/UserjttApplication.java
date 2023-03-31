package com.fr.momozer.userJTT.userjtt;

import com.fr.momozer.userJTT.userjtt.model.Role;
import com.fr.momozer.userJTT.userjtt.model.User;
import com.fr.momozer.userJTT.userjtt.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class UserjttApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserjttApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "John Travolta", "John", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Will Smith", "will", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Luc skywalker", "Luc", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Clark Kent", "superman", "1234", new ArrayList<>()));

			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("john", "ROLE_MANAGER");
			userService.addRoleToUser("john", "ROLE_ADMIN");
			userService.addRoleToUser("will", "ROLE_USER");
			userService.addRoleToUser("superman", "ROLE_USER");
		};
	}

}
