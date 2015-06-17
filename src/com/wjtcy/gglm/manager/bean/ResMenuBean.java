package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class ResMenuBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8479502413608725366L;

	private int id ;
	
	/**饭店id*/
	private int resId ;
	
	/**食物名称*/
	private String foodName ;
	
	/**食物描述*/
	private String foodDesc ;
	
	/**所属菜系*/
	private String foodCuisine ;
	
	/**现价*/
	private BigDecimal costPrice ;
	
	/**原价*/
	private BigDecimal oriPrice ;
	
	private int status = 0 ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodDesc() {
		return foodDesc;
	}

	public void setFoodDesc(String foodDesc) {
		this.foodDesc = foodDesc;
	}

	public String getFoodCuisine() {
		return foodCuisine;
	}

	public void setFoodCuisine(String foodCuisine) {
		this.foodCuisine = foodCuisine;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
