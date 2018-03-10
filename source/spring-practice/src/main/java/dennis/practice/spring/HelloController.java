package dennis.practice.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
    @RequestMapping("/hello/{name}")
    public String helloWithName(@PathVariable String name) {
        return "Hello " + name;
    }
}