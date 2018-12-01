package com.hackathon.dao;

import java.util.List;

import com.hackathon.model.Questions;

public interface QuestionsDAOInterface {
	
	
	public Questions findQuestionById(int gq_id);

	public List<Questions> getAllQuestions();


}