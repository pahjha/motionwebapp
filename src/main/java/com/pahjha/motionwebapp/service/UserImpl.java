package com.pahjha.motionwebapp.service;

public class UserImpl implements User {

	private String name;
	private String encryptedPassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

}
