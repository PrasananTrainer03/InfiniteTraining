package com.java.hexa.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.hexa.spring.dao.EmployDAO;
import com.java.hexa.spring.model.Employ;

@Controller
public class HomeController {

	 @Autowired
	    private EmployDAO employDAO;
	 
	 @RequestMapping(value="/")
	 public ModelAndView listEmploy(ModelAndView model) throws IOException{
	     List<Employ> listEmploy = employDAO.listEmploy();
	     model.addObject("listEmploy", listEmploy);
	     model.setViewName("home");
	  
	     return model;
	 }
	 
	 @RequestMapping(value = "/saveemploy", method = RequestMethod.POST)
	 public ModelAndView saveContact(@ModelAttribute Employ employ) {
	     employDAO.addEmploy(employ);
	     return new ModelAndView("redirect:/");
	 }
	 @RequestMapping(value = "/newemploy", method = RequestMethod.GET)
	 public ModelAndView newContact(ModelAndView model) {
	     Employ employ = new Employ();
	     model.addObject("employ", employ);
	     model.setViewName("employform");
	     return model;
	 }
}
