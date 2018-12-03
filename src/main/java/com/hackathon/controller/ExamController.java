package com.hackathon.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hackathon.dao.ExamDAO;
import com.hackathon.dao.QuestionsDAO;
import com.hackathon.model.Questions;
import com.hackathon.model.User;

@Controller
public class ExamController {

	@Autowired
	QuestionsDAO qdao;
	
	@Autowired
	ExamDAO edao;

	@RequestMapping("/ExamInstructions")
	public ModelAndView redirectToInstructionPage(HttpServletRequest req, HttpServletResponse res) {
		
		HttpSession userSession = req.getSession(false);
		if(null != userSession) {
			return new ModelAndView("ExamInstructions");
		}
		else {
			return new ModelAndView("UserLogin");
		}

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
		System.out.println("examSes" + ses);
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
			
			//Code for putting score in database for the current logged in user..
			HttpSession userSession = req.getSession(false);
			System.out.println("userSession" + userSession);
			User u = (User)userSession.getAttribute("user");
			
			String passOrFail = "fail";
			if(scoreCounter < 2) {
				passOrFail = "Pass";
			}
			
			int i = edao.setScore(u, scoreCounter, passOrFail);
			
			//Code for sending score to the result page
			ses.setAttribute("scoreCounter", scoreCounter);
			model.addObject(scoreCounter);
			model.setViewName("ScorePage");
			return model;
			
		}
		
	}

}