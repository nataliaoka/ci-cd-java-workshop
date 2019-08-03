package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* Exemplo básico de um comentário em JavaDoc com mais de uma linha.
* @author  natalia oka
* @version 1.0
* @since   2019-08-03
*/
@RestController
@CrossOrigin
public class TestController {
   /**
   * Method testController.
   * @return string This returns a text.
   */
@GetMapping("/home")
	public String homeRequest() {
		return "Hello World!";
	}
}
