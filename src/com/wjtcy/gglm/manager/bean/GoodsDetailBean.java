package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class GoodsDetailBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4604353760375203428L;

	private int id ;
	
	/**门店Id*/
	private Integer shopId ;
	
	/** 城市Id */
	private Integer cityId ;
	
	/**商圈id*/
	private Integer areaId ;
	
	/** 商品名称 */
	private String goodsName ;
	
	/** 商品描述 */
	private String goodsDesc ;
	
	/** 商品分类 */
	private String goodsType ;
	
	/** 现价 */
	private BigDecimal costPrice ;
	
	/** 原价 */
	private BigDecimal oriPrice ;
	
	/** 返现 */
	private BigDecimal backMoney ;
	
	/** 商品创建时间 */
	private Long createTime ;
	
	/** 商品上架时间 */
	private Long beginTime ;
	
	/** 商品下架时间 */
	private Long endTime ;
	
	/** 商品可购买个数 -1:不限 */
	private Integer goodsCount ;
	
	/** 商品出售个数 */
	private Integer goodsSellNum ;
	
	/** 是否审核通过，0：未通过，1：已通过 */
	private Integer isConfirm ;
	
	/** 是否有效，0：有效，1：无效 */
	private Integer status = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getOriPrice() {
		return oriPrice;
	}

	public void setOriPrice(BigDecimal oriPrice) {
		this.oriPrice = oriPrice;
	}

	public BigDecimal getBackMoney() {
		return backMoney;
	}

	public void setBackMoney(BigDecimal backMoney) {
		this.backMoney = backMoney;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Integer getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public Integer getGoodsSellNum() {
		return goodsSellNum;
	}

	public void setGoodsSellNum(Integer goodsSellNum) {
		this.goodsSellNum = goodsSellNum;
	}

	public Integer getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Integer isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
