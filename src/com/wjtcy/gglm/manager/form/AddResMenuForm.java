package com.wjtcy.gglm.manager.form;

/**
 * 菜单项添加表单
 * @author lyg
 *
 */
public class AddResMenuForm {

	/**饭店id，加密后的字段*/
	private String resId ;
	
	/**食物名称*/
	private String  foodName ;
	
	/**食物描述*/
	private String foodDesc ;
	
	/**食物所属菜系*/
	private String foodCuisine ;
	
	/**售价*/
	private String costPrice ;
	
	/**原价*/
	private String oriPrice ;

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
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

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public String getOriPrice() {
		return oriPrice;
	}

	public void setOriPrice(String oriPrice) {
		this.oriPrice = oriPrice;
	}
	
}
