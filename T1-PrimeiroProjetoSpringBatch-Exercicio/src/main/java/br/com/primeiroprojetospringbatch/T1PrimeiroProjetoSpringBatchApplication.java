package br.com.primeiroprojetospringbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class T1PrimeiroProjetoSpringBatchApplication {
	
		public static void main(String[] args) {
		SpringApplication.run(T1PrimeiroProjetoSpringBatchApplication.class, args);
	}

}
