package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderInfoBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7637384188432470202L;

	private int id ; 

	/** 用户id */
	private Integer userId ;
	
	/** 商品id */
	private Integer goodsId  ;
	
	/** 订单的金额 */
	private BigDecimal orderPrice ;
	
	/** 第三方支付的金额 */
	private BigDecimal moneyPaid ;
	
	/** 余额支付的金额 */
	private BigDecimal surplus ;

	/** 支付金额 */
	private BigDecimal purchasePrice ;
	
	/** 购买的个数 */
	private Integer purchaseNumber ;
	
	/** 关联的任务id */
	private Integer missionId ;
	
	/** 任务类型，1：基于商品的类型 */
	private Integer missionType ;
	
	/** 下单时间 */
	private Long addTime ;
	
	/** 是否有效0:有效，1：无效 */
	private Integer status ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public BigDecimal getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	public BigDecimal getMoneyPaid() {
		return moneyPaid;
	}

	public void setMoneyPaid(BigDecimal moneyPaid) {
		this.moneyPaid = moneyPaid;
	}

	public BigDecimal getSurplus() {
		return surplus;
	}

	public void setSurplus(BigDecimal surplus) {
		this.surplus = surplus;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Integer getPurchaseNumber() {
		return purchaseNumber;
	}

	public void setPurchaseNumber(Integer purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	public Integer getMissionId() {
		return missionId;
	}

	public void setMissionId(Integer missionId) {
		this.missionId = missionId;
	}

	public Integer getMissionType() {
		return missionType;
	}

	public void setMissionType(Integer missionType) {
		this.missionType = missionType;
	}

	public Long getAddTime() {
		return addTime;
	}

	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
