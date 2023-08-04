package space.bumsoap.sec.csrf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class UserController {
	@GetMapping
	String loginView() {
		return "login";
	}
	
	@PostMapping
	String loginProcess() {
		return "home";
	}

}
