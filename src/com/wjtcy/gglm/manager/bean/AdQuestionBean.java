package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;

public class AdQuestionBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1919946370411646984L;

	private int id ;
	
	/**'广告问答题', */
	private String adQuestion ;
	
	/**'答案列表，半角字符逗号分隔多个答案',*/
	private String adAnswer ;
	
	/**单选题还是多选题，1：单选，2：多选*/
	private int adAnswerType = 1;
	
	/** '是否通过审核'*/
	private int isConfirm ;
	
	/**'是否删除，0为正常',*/
	private int status = 0 ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdQuestion() {
		return adQuestion;
	}

	public void setAdQuestion(String adQuestion) {
		this.adQuestion = adQuestion;
	}

	public String getAdAnswer() {
		return adAnswer;
	}

	public void setAdAnswer(String adAnswer) {
		this.adAnswer = adAnswer;
	}

	public int getAdAnswerType() {
		return adAnswerType;
	}

	public void setAdAnswerType(int adAnswerType) {
		this.adAnswerType = adAnswerType;
	}

	public int getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(int isConfirm) {
		this.isConfirm = isConfirm;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	} 
	
}
