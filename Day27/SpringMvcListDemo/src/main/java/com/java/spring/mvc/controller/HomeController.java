package com.java.spring.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.spring.mvc.bean.Employ;

@Controller
public class HomeController {

	 static List<Employ> employList;
	 static {
		 employList = new ArrayList<Employ>();
	 }
	 @RequestMapping("/employform")  
	 public String showEmployForm(Model model) {
		 model.addAttribute("command", new Employ());
		 return "employform";
	 }
	 @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public String save(@ModelAttribute("emp") Employ emp, Model m){   
	    	employList.add(emp);
	    	 m.addAttribute("list",employList);
	        return "viewemploy";//will redirect to viewemp request mapping  
	    }  
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
