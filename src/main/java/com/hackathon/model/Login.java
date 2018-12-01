package com.hackathon.model;

public class Login {
	private String gu_email;
	
	public String getGu_email() {
		return gu_email;
	}
	public void setGu_email(String gu_email) {
		this.gu_email = gu_email;
	}
	public String getGu_password() {
		return gu_password;
	}
	public void setGu_password(String gu_password) {
		this.gu_password =  MD5.getMd5(gu_password);
	}
	private String gu_password;
}
