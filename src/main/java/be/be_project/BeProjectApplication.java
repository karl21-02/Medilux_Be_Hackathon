package be.be_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeProjectApplication.class, args);
	}

}
