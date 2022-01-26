package edu.eci.ieti.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Collections;

@SpringBootApplication
public class AppApplication {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		SpringApplication app = new SpringApplication(AppApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", getPort()));
		app.run(args);
	}

	/**
	 * Method that return the port to use in spring-boot
	 * @return int, that represents PORT number to use in our local-app
	 */
	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 8080;
	}
}
