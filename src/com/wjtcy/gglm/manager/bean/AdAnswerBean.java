package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;

/**
 * 广告问答，答案选项
 * @author lyg
 *
 */
public class AdAnswerBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1551744052923522706L;

	private int id ;
	
	/**广告语问答题Id*/
	private int adQuestionId ;
	
	/**答案编号*/
	private int adAnswerNumber ;
	
	/**答案内容*/
	private String adAnswerContent ;
	
	/**答案是否有序,多选的填空，需要保证答案顺序*/
	private int isOrder = 0 ;
	
	/**是否为正确的答案：0，正确，1不正确*/
	private int isCorrect ;
	
	/**是否删除，0为正常'*/
	private int status ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdQuestionId() {
		return adQuestionId;
	}

	public void setAdQuestionId(int adQuestionId) {
		this.adQuestionId = adQuestionId;
	}

	public int getAdAnswerNumber() {
		return adAnswerNumber;
	}

	public void setAdAnswerNumber(int adAnswerNumber) {
		this.adAnswerNumber = adAnswerNumber;
	}

	public String getAdAnswerContent() {
		return adAnswerContent;
	}

	public void setAdAnswerContent(String adAnswerContent) {
		this.adAnswerContent = adAnswerContent;
	}

	public int getIsOrder() {
		return isOrder;
	}

	public void setIsOrder(int isOrder) {
		this.isOrder = isOrder;
	}

	public int getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(int isCorrect) {
		this.isCorrect = isCorrect;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	} 
	
}
