package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello") // only maps to a GET method by default. for others specify in annotation
	public String sayHi() {
		return "Hi";
	}

}
