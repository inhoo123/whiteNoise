package com.inhoo.white_noise.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inhoo.white_noise.models.UserVO;
import com.inhoo.white_noise.persistance.UserDao;
import com.inhoo.white_noise.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/user")
public class UserController {

	private final UserService userService;
	private final UserDao userDao;

	public UserController(UserService userService, UserDao userDao) {
		super();
		this.userService = userService;
		this.userDao = userDao;
	}

	// 로그인화면
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "user/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String user_email, String user_password, HttpSession httpSession) {
		UserVO user = userDao.loginByUserEmailAndPassword(user_email);
		if (user.getUser_password().equals(user_password)) {
			httpSession.setAttribute("USER", user);
		}
		return "redirect:/";
	}

	// 회원가입 화면
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {

		return "user/join";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVO userVO, Model model,String user_email, HttpSession httpSession ) {
		int ret = userService.insert(userVO);
		UserVO user = userDao.joinByUserEmail(user_email);
		if (ret < 1 && !user.getUser_email().equals(user_email)) {
			model.addAttribute("JOIN_MSG", "FAIL");
			return "home";	
		}
		return "user/join";
	}
}
