package com.hackathon.model;

public class Score {
	private int gs_id;
	private int gu_id;
	private int ge_id;
	private int gs_score;
	private int gs_remark;
	
	public int getGs_id() {
		return gs_id;
	}
	public void setGs_id(int gs_id) {
		this.gs_id = gs_id;
	}
	public int getGu_id() {
		return gu_id;
	}
	public void setGu_id(int gu_id) {
		this.gu_id = gu_id;
	}
	public int getGe_id() {
		return ge_id;
	}
	public void setGe_id(int ge_id) {
		this.ge_id = ge_id;
	}
	public int getGs_score() {
		return gs_score;
	}
	public void setGs_score(int gs_score) {
		this.gs_score = gs_score;
	}
	public int getGs_remark() {
		return gs_remark;
	}
	public void setGs_remark(int gs_remark) {
		this.gs_remark = gs_remark;
	}
	
	
	@Override
	public String toString() {
		return "Score [gs_id=" + gs_id + ", gu_id=" + gu_id + ", ge_id=" + ge_id + ", gs_score=" + gs_score
				+ ", gs_remark=" + gs_remark + "]";
	}
	
	
	
}
