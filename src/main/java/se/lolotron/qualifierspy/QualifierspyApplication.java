package se.lolotron.qualifierspy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class QualifierspyApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierspyApplication.class, args);
	}

	@Primary
	@Bean("simpleService1")
	public SimpleService simpleService1() {
		return new SimpleService("hello 1");
	}

	@Bean("simpleService2")
	public SimpleService simpleService2() {
		return new SimpleService("hello 2");
	}

}
