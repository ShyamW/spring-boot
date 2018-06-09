package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /* must put on any rest controller. Rest controller means methods corespond to requests*/
public class HelloController {
	
	/* when url/hello: execute sayHi */
	@RequestMapping("/hello")	
	public String sayHI() {
		return "HI";
	}
	
}
