package com.hackathon.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hackathon.dao.QuestionsDAO;
import com.hackathon.model.Questions;

@Controller
public class ExamController {

	@Autowired
	QuestionsDAO qdao;

	@RequestMapping("/ExamInstructions")
	public ModelAndView redirectToInstructionPage() {
		return new ModelAndView("ExamInstructions");
	}

	@RequestMapping("/startExam")
	public ModelAndView startExam(HttpServletRequest req, HttpServletResponse res, ModelAndView model) {


		List<Questions> qnlist = qdao.getAllQuestions();

		int listcount=1;
		int count = 0;
		int scoreCounter = 0;

		HttpSession ses = req.getSession(true);
		ses.setAttribute("counter", count);
		ses.setAttribute("listcount", listcount);
		ses.setAttribute("scoreCounter", scoreCounter);
		ses.setAttribute("listsize", qnlist.size());
		
		Questions q = qnlist.get(count);

		model.addObject("questionData", q);
		model.setViewName("ExamPage");
		return model;
	}

	@RequestMapping("/nextQn")
	public ModelAndView nextQn(HttpServletRequest req, HttpServletResponse res, ModelAndView model) {

		HttpSession ses = req.getSession(false);
		int count = (Integer)ses.getAttribute("counter");
		int listcount = (Integer)ses.getAttribute("listcount");
		int scoreCounter = (Integer)ses.getAttribute("scoreCounter");
		int qnlistSize = (Integer)ses.getAttribute("listsize");
		String option = req.getParameter("op");
		listcount++;
		if(option.equals("yes")) {
			
			scoreCounter++;
			System.out.println("yay bro tera ans bohot sahi hai bc!!");
		}
		
		System.out.println("list count: " + listcount);
		System.out.println("qn list size: " + qnlistSize);
		System.out.println("score " + scoreCounter);
		
		if(listcount<=qnlistSize) {

			List<Questions> qnlist = qdao.getAllQuestions();
			count++;
			Questions q = qnlist.get(count);
			
			System.out.println(q);
			ses.setAttribute("scoreCounter", scoreCounter);
			ses.setAttribute("counter", count);
			ses.setAttribute("listcount", listcount);
			model.addObject("questionData", q);
			model.setViewName("ExamPage");
			return model;
			
		}
		else {

			ses.setAttribute("scoreCounter", scoreCounter);
			model.addObject(scoreCounter);
			model.setViewName("ScorePage");
			return model;
			
		}
		
	}

}