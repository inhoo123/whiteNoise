package com.inhoo.white_noise.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inhoo.white_noise.models.UserVO;
import com.inhoo.white_noise.persistance.UserDao;
import com.inhoo.white_noise.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private final UserService userService;
	private final UserDao userDao;
	
	public HomeController(UserService userService, UserDao userDao) {
		super();
		this.userService = userService;
		this.userDao = userDao;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "home";
	}
	@RequestMapping(value="/user/login", method = RequestMethod.GET )
	public String login() {
		
		return "user/login";
	}
	@RequestMapping(value="/user/join", method = RequestMethod.GET )
	public String join() {
		
		return "user/login";
	}
	
	
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(UserVO userVO,Model model) {
		
	
		int ret = UserService.join(userVO);
		if(ret < 1) {
			model.addAttribute("JOIN_MSG","FAIL");
			return "user/join";
		}
		return "redirect:/";
	}
}
