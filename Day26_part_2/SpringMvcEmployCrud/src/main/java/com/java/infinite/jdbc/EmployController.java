package com.java.infinite.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployController {
	
	@RequestMapping("/showemploy")
	public ModelAndView showEmploy() {
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("com/java/infinite/jdbc/jdbc.xml");
		EmployDao dao = (EmployDao)ctx.getBean("employDao");
		Employ[] empList = dao.showEmploy();
		return new ModelAndView("showemploy", "empList", empList);
	}
}
