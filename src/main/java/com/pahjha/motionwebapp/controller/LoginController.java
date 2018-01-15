package com.pahjha.motionwebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pahjha.motionwebapp.service.LoginService;
import com.pahjha.motionwebapp.service.LoginServiceImpl;
import com.pahjha.motionwebapp.service.User;
import com.pahjha.motionwebapp.service.UserImpl;

@Controller
public class LoginController {

	private static final String VIEW_HOME = "home";
	private static final String VIEW_LOGIN = "login";
	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("name") String name, @RequestParam("password") String password, ModelMap model) {

		User user = new UserImpl();
		user.setName(name);
		user.setEncryptedPassword(password);
		LoginService loginService = new LoginServiceImpl();
		boolean result = loginService.login(user);
		if (result) {
			model.addAttribute("message", "Welcome " + name);
			return VIEW_HOME;
		}
		model.addAttribute("message", "Username/password not correct!");
		return VIEW_LOGIN;
	}

	// @ModelAttribute("user")
	// public User (@RequestParam String number) {
	// return accountManager.findAccount(number);
	// }
	// @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	// public String welcomeName(@PathVariable String name, ModelMap model) {
	//
	// model.addAttribute("message", "Welcome " + name);
	// model.addAttribute("counter", ++counter);
	// logger.debug("[welcomeName] counter : {}", counter);
	// return VIEW_INDEX;
	//
	// }

}