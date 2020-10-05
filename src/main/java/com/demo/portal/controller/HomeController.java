package com.demo.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.portal.model.StudentDTO;
import com.demo.portal.service.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(value={"/", "/home"})
	public String home() {
		System.out.println("InsideController");
		return "text";
	}
	
	@RequestMapping(value="/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute StudentDTO dto) {
		ModelAndView mv= new  ModelAndView("text");
		mv.addObject("message", "You have been suceessfully registered");
		System.out.println("username is ; "+dto.getUsername());
		service.saveStudent(dto);
		return mv;
	}

	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/loginStudent")
	public ModelAndView loginStudent(@ModelAttribute StudentDTO dto) {
		ModelAndView mv= new  ModelAndView("login");
		boolean isStudentRegistered = service.loginStudent(dto);
		if(isStudentRegistered) {
			System.out.println("you havebeen sucessfully logged in");
			mv.addObject("message", "you have been sucessfully logged in");
		}
		else {
			System.out.println("login failed");
			mv.addObject("message", "login failed");
		}
		return mv;
	}
}
