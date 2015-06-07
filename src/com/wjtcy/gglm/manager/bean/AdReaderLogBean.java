package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;

/**
 * 广告背诵关联关系表
 * @author lyg
 *
 */
public class AdReaderLogBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5467535985047120186L;

	private int id ;
	
	/**用户id*/
	private int userId ;
	
	/**广告id*/
	private int adInfoId ;
	
	/**广告问答id*/
	private int adInfoQuestionsId ;
	
	/**用户回答的答案 */
	private String userAnswer ;
	
	/**用户的回答是否正确*/
	private int isCorrect = 0 ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAdInfoId() {
		return adInfoId;
	}

	public void setAdInfoId(int adInfoId) {
		this.adInfoId = adInfoId;
	}

	public int getAdInfoQuestionsId() {
		return adInfoQuestionsId;
	}

	public void setAdInfoQuestionsId(int adInfoQuestionsId) {
		this.adInfoQuestionsId = adInfoQuestionsId;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	public int getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(int isCorrect) {
		this.isCorrect = isCorrect;
	}
	
}
