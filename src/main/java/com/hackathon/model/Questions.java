package com.hackathon.model;

public class Questions {


	private int gq_id;
	private String gq_question;
	private int gq_marks;
	private String gq_level;
	private String gq_op1;
	private String gq_op1_Ans;
	private String gq_op2;
	private String gq_op2_Ans;
	private String gq_op3;
	private String gq_op3_Ans;
	private String gq_op4;
	private String gq_op4_Ans;
	private String gq_tech;


	public int getGq_id() {
		return gq_id;
	}

	public void setGq_id(int gq_id) {
		this.gq_id = gq_id;
	}


	public String getGq_question() {
		return gq_question;
	}

	public void setGq_question(String gq_question) {
		this.gq_question = gq_question;
	}


	public int getGq_marks() {
		return gq_marks;
	}

	public void setGq_marks(int gq_marks) {
		this.gq_marks = gq_marks;
	}


	public String getGq_level() {
		return gq_level;
	}

	public void setGq_level(String gq_level) {
		this.gq_level = gq_level;
	}


	public String getGq_op1() {
		return gq_op1;
	}

	public void setGq_op1(String gq_op1) {
		this.gq_op1 = gq_op1;
	}


	public String getGq_op1_Ans() {
		return gq_op1_Ans;
	}

	public void setGq_op1_Ans(String gq_op1_Ans) {
		this.gq_op1_Ans = gq_op1_Ans;
	}


	public String getGq_op2() {
		return gq_op2;
	}

	public void setGq_op2(String gq_op2) {
		this.gq_op2 = gq_op2;
	}


	public String getGq_op2_Ans() {
		return gq_op2_Ans;
	}

	public void setGq_op2_Ans(String gq_op2_Ans) {
		this.gq_op2_Ans = gq_op2_Ans;
	}


	public String getGq_op3() {
		return gq_op3;
	}

	public void setGq_op3(String gq_op3) {
		this.gq_op3 = gq_op3;
	}


	public String getGq_op3_Ans() {
		return gq_op3_Ans;
	}

	public void setGq_op3_Ans(String gq_op3_Ans) {
		this.gq_op3_Ans = gq_op3_Ans;
	}


	public String getGq_op4() {
		return gq_op4;
	}

	public void setGq_op4(String gq_op4) {
		this.gq_op4 = gq_op4;
	}


	public String getGq_op4_Ans() {
		return gq_op4_Ans;
	}

	public void setGq_op4_Ans(String gq_op4_Ans) {
		this.gq_op4_Ans = gq_op4_Ans;
	}


	public String getGq_tech() {
		return gq_tech;
	}

	public void setGq_tech(String gq_tech) {
		this.gq_tech = gq_tech;
	}

	public String[] getOpAns() {
		String op[] = new String[4];
		op[0] = getGq_op1_Ans();
		op[1] = getGq_op1_Ans();
		op[2] = getGq_op1_Ans();
		op[3] = getGq_op1_Ans();
		return op;
	}

	@Override
	public String toString() {
		return "Questions [gq_id=" + gq_id + ", gq_question=" + gq_question + ", gq_marks=" + gq_marks + ", gq_level="
				+ gq_level + ", gq_op1=" + gq_op1 + ", gq_op1_Ans=" + gq_op1_Ans + ", gq_op2=" + gq_op2
				+ ", gq_op2_Ans=" + gq_op2_Ans + ", op3=" + gq_op3 + ", gq_op3_Ans=" + gq_op3_Ans + ", gq_op4=" + gq_op4
				+ ", gq_op4_Ans=" + gq_op4_Ans + ", gq_tech=" + gq_tech + "]";
	}


}