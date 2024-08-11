package com.inhoo.white_noise.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inhoo.white_noise.models.UserVO;
import com.inhoo.white_noise.persistance.UserDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession httpSession, Model model) {
		
		UserVO userVO = (UserVO)httpSession.getAttribute("USER");
		if(userVO==null) {
			return "error";
		}
		return "home";
	}
}
