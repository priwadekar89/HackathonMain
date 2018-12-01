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
		
		int listcount=0;
		int count = 0;
		
		HttpSession ses = req.getSession(true);
		ses.setAttribute("counter", count);
		ses.setAttribute("listcount", listcount);
		
		Questions q = qnlist.get(count);
		
		model.addObject("questionData", q);
		model.setViewName("ExamPage");
		return model;
	}

	@RequestMapping("/nextQn")
	public ModelAndView nextQn(HttpServletRequest req, HttpServletResponse res, ModelAndView model) {
		
		List<Questions> qnlist = qdao.getAllQuestions();
		
		
		
		HttpSession ses = req.getSession(false);
		int count = (Integer)ses.getAttribute("counter");
		int listcount = (Integer)ses.getAttribute("listcount");
		
		
		if(listcount<=qnlist.size()) {
			
			String option = req.getParameter("op");
			System.out.println(option);
			
			
			for(String op : qnlist.get(count).getOpAns()) {
				if(option.equals(op)) {
					System.out.println("yay");
				}
			}
			
			
			count++;
			Questions q = qnlist.get(count);
			listcount++;

			System.out.println(q);
			ses.setAttribute("counter", count);
			ses.setAttribute("listcount", listcount);
			model.addObject("questionData", q);
			model.setViewName("ExamPage");
		}
		else {

		}
		return model;
	}
	
}