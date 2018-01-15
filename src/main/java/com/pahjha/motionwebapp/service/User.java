package com.pahjha.motionwebapp.service;

public interface User {
	String getName();

	void setName(String name);

	String getEncryptedPassword();

	void setEncryptedPassword(String encryptedPassword);
}
