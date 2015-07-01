package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;

public class GoodsMissionDetailBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5983453178378505399L;

	private Integer id ;
	
	/** 基于商品的广告的任务id */
	private Integer goodsMissionId ;
	
	/** 商品id */
	private Integer goodsId ;
	
	/** 广告id */
	private Integer adId ;
	
	/** 广告问题 */
	private String adQuestion ;
	
	/** 广告答案 */
	private String adAnswer ;
	
	/** 是否有效0：有效，1：无效 */
	private Integer status = 0 ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGoodsMissionId() {
		return goodsMissionId;
	}

	public void setGoodsMissionId(Integer goodsMissionId) {
		this.goodsMissionId = goodsMissionId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getAdId() {
		return adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
