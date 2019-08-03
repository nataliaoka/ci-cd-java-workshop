package com.testService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
* Exemplo básico de um comentário em JavaDoc com mais de uma linha.
* @author  natalia oka
* @version 1.0
* @since   2019-08-03
*/
@SpringBootApplication
@ComponentScan(basePackageClasses = { TestController.class })
@EnableAutoConfiguration
public class TestServiceApplication {
/**
* Exemplo básico de um comentário em JavaDoc com mais de uma linha.
*/
   public static void main(String[] args) {
   /**
   * Exemplo básico de um comentário em JavaDoc com mais de uma linha.
   * @param args parametro para executar a aplicação.
   */
	   SpringApplication.run(TestServiceApplication.class, args);
	   System.exit(0);
	}

}
