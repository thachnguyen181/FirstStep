package tma.com.hibernate_test_onetoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"tma.com"})
@EntityScan("tma.com.repository")
@EnableJpaRepositories(basePackages="tma.com.repository")
public class App 
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
