package pu.soft.arch.GitHerokuDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

	@GetMapping(path="/")
	public String retrieveGreeting() {
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = currentDateTime.format(dateTimeFormatter);
		return "Hello there, the date and time is: "+ formattedDateTime;
	}
}
