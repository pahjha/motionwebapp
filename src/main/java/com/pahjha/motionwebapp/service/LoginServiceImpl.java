package com.pahjha.motionwebapp.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginServiceImpl implements LoginService {

	private static final Logger Log = LoggerFactory.getLogger(LoginServiceImpl.class);
	private Map<String, String> map = new HashMap<>();

	public LoginServiceImpl() {
		map.put("hello", "hello");
	}

	@Override
	public boolean login(User user) {
		Log.debug(user.getName());
		if (map.containsKey(user.getName())) {
			String pwdInDb = map.get(user.getName());
			if (pwdInDb.equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}

}
