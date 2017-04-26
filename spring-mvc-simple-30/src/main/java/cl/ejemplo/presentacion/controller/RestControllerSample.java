package cl.ejemplo.presentacion.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/http/HttpStatus.html
 *
 */

@RestController
public class RestControllerSample {

	@RequestMapping("/hola")
	public String welcome() { // Welcome page, non-rest
		return "Welcome to RestTemplate Example.";
	}

	// method = RequestMethod.GET,
	@RequestMapping(value = "/hello/{codigo}", method = RequestMethod.GET)
	public ResponseEntity<String> message(@PathVariable String codigo) {// REST endpoint

		String json = "{\"id\":1,\"content\":\"Hello, World!\"}";

		switch (codigo) {
			case "200":
				return new ResponseEntity<>(json, HttpStatus.OK);
			case "400":
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			case "500":
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			case "501":
				return new ResponseEntity<>(HttpStatus.valueOf(501)); // NOT_IMPLEMENTED
		}

		return null;
	}

}

