package com.qroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
//@EnableOAuth2Sso
public class QroomApplication {
	public static void main(String[] args) {
		SpringApplication.run(QroomApplication.class, args);
	}
}
