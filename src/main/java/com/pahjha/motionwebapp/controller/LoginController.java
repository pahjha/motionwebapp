package com.pahjha.motionwebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pahjha.motionwebapp.service.LoginService;
import com.pahjha.motionwebapp.service.LoginServiceImpl;
import com.pahjha.motionwebapp.service.User;

@Controller
public class LoginController {

	private static final String VIEW_HOME = "home";
	private static final String VIEW_LOGIN = "login";
	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_LOGIN;

	}

	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") User user, ModelMap model) {

		LoginService loginService = new LoginServiceImpl();
		boolean result = loginService.login(user);
		if (result) {
			model.addAttribute("name", user.getName());
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