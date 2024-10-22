package br.com.develcode.whitelabel;

import br.com.develcode.whitelabel.autoconfigure.DatabaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(DatabaseProperties.class)
public class WhiteLabelAsPomLibApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhiteLabelAsPomLibApplication.class, args);
	}

}
