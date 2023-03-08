package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavController {
	@GetMapping("forward")
	public String forward() {
//target만잇을땐 view네임으로인지 forward:를붙힘으로써 url
		return "forward:target";
	}
	
	//forward매서드에서받은 리퀘스트를 타겟으로이동
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target";
	}
	
	//response
	@GetMapping("redirect")
	public String redirect() {
		return "redirect:target";
	}
	
	@GetMapping("naver")
	public String naver() {
		return "redirect:http://www.naver.com";
	}
}
