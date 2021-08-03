package com.java.infinite.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		return new ModelAndView("result", "message", "Welcome to Spring MVC");
	}
	
	@RequestMapping("/sunil")
	public ModelAndView sunilPage() {
		return new ModelAndView("result", "message", "Hi I am Sunil Kumar K");
	}
}
