package com.pahjha.motionwebapp.service;

import java.util.HashMap;
import java.util.Map;

public class LoginServiceImpl implements LoginService {

	Map<String, String> map = new HashMap<>();

	public LoginServiceImpl() {
		map.put("hello", "hello");
	}

	@Override
	public boolean login(User user) {
		if (map.containsKey(user.getName())) {
			String pwdInDb = map.get(user.getName());
			if (pwdInDb.equals(user.getEncryptedPassword())) {
				return true;
			}
		}
		return false;
	}

}
