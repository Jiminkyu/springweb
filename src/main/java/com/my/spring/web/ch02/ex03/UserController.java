package com.my.spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex03")
@RequestMapping("ch02/ex03/user")
public class UserController {
	@GetMapping
	public String userIn() {
		return "ch02/ex03/userIn";
	}
	
	
	@PostMapping  //핸들러를 구성할때 command(User)를 이용한다. 
	public String userOut(User user) {
		return "ch02/ex03/userOut";
	}
}
