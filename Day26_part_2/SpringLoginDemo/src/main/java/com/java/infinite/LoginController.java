package com.java.infinite;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView validate(HttpServletRequest req,HttpServletResponse res){
		if(req.getParameter("userName").equals("Sunil")
					&&req.getParameter("password").equals("Kallepalli")){
			return new ModelAndView("result","result","Successfully Loggedin");
		}
		else{
			return new ModelAndView("login","result","Invalid Credentials");
		}
	}
}
