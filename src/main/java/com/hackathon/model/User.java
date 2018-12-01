package com.hackathon.model;

public class User {
	
	private int gu_id;
	private String gu_name;
	private String gu_email;
	private long gu_mobile;
	private String gu_dob;
	private int ga_id;
	private String gu_password;
	
	public int getGu_id() {
		return gu_id;
	}
	public void setGu_id(int gu_id) {
		this.gu_id = gu_id;
	}
	public String getGu_name() {
		return gu_name;
	}
	public void setGu_name(String gu_name) {
		this.gu_name = gu_name;
	}
	public String getGu_email() {
		return gu_email;
	}
	public void setGu_email(String gu_email) {
		this.gu_email = gu_email;
	}
	public long getGu_mobile() {
		return gu_mobile;
	}
	public void setGu_mobile(long gu_mobile) {
		this.gu_mobile = gu_mobile;
	}
	public String getGu_dob() {
		return gu_dob;
	}
	public void setGu_dob(String gu_dob) {
		this.gu_dob = gu_dob;
	}
	public int getGa_id() {
		return ga_id;
	}
	public void setGa_addrId(int gu_addrId) {
		this.ga_id = ga_id;
	}
	public String getGu_password() {
		return gu_password;
	}
	public void setGu_password(String gu_password) {
		this.gu_password = gu_password;
	}
	
	
	@Override
	public String toString() {
		return "User [gu_id=" + gu_id + ", gu_name=" + gu_name + ", gu_email=" + gu_email + ", gu_mobile=" + gu_mobile
				+ ", gu_dob=" + gu_dob + ", gu_addrId=" + ga_id + ", gu_password=" + gu_password + "]";
	}

	//private String qualification;
	//private long yoc;
	
	
}
	/*
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public long getYoc() {
		return yoc;
	}
	public void setYoc(long yoc) {
		this.yoc = yoc;
	}
	*/