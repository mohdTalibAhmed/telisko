package com.example.demo;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home(Aliens aliens){
		ModelAndView mv=new ModelAndView();
		mv.addObject("aliens",aliens);
		mv.setViewName("home.jsp");
		
		return mv;
	}

}
