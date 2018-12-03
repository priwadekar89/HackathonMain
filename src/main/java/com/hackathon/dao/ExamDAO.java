package com.hackathon.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hackathon.model.User;

public class ExamDAO implements ExamDAOInterface {
	
	JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		
		
		return jdbcTemplate;
		
		
	}
	
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		
		
		this.jdbcTemplate = jdbcTemplate;
		
		
	}
	
	public intsetScore(User u, int score, String passOrFail) {
		
		
		return ;
	}

}
