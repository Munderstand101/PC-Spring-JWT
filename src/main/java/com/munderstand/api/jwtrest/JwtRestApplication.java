package com.munderstand.api.jwtrest;

import com.munderstand.api.jwtrest.Entity.Role;
import com.munderstand.api.jwtrest.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtRestApplication.class, args);
	}

	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_USER"));
		};
	}

}
