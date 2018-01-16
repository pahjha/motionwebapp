package com.pahjha.motionwebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {

	private static final String VIEW_LOGIN = "login";
	private final static Logger logger = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_LOGIN;

	}

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