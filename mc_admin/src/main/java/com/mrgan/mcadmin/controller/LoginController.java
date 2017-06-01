package com.mrgan.mcadmin.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mrgan.mcadmin.model.User;

@Controller
public class LoginController {
	private static final Logger logger = LogManager.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) { 
		model.addAttribute("user", new User());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginForm(@ModelAttribute(value = "user") User user, Model model) {
		System.out.println(user);
		return "login";
	}
}
