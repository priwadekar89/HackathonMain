package com.hackathon.dao;

import com.hackathon.model.Address;
import com.hackathon.model.User;

public interface RegistrationDAOInterface {
	
	
	public int saveRegistrationData(User user, Address addr);
	
	public boolean validateUser(User user);
	
	
}