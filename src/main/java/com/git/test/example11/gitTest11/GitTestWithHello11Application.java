package com.git.test.example11.gitTest11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestWithHello11Application {

	public static void main(String[] args) {
		System.out.println("Hi");
		SpringApplication.run(GitTestWithHello11Application.class, args);
		System.out.println("Hello");
	}

}
