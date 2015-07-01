package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 基于商品维度的广告设计，一个商品对应多个广告，然后商品免费
 * @author lyg
 *
 */
public class GoodsMissionBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1128941272632551170L;

	private Integer id ;
	
	/** 对应商品id */
	private Integer goodsId ;

	/** 商品免费所售个数 */
	private Integer goodsNum ;
	
	/** 是否通过审核0：未通过，1：通过 */
	private Integer isConfirm ;
	
	/** 起始事件 */
	private Timestamp startTime ;
	
	/** 结束时间 */
	private Timestamp endTime ;
	
	/** 是否有效，0：有效，1：无效 */
	private Integer status = 0 ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Integer getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Integer isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
