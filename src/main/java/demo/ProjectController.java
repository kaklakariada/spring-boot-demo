package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/projects")
public class ProjectController {
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getProjects() {
		return "Greetings from Spring Boot!";
	}
}