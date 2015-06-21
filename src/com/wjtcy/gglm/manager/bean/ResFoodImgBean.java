package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;


public class ResFoodImgBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6915736643962289732L;

	private int id ;
	
	/**对应菜单id */
	private int resFoodId ;
	
	/**食物图片链接地址*/
	private String resFoodImg ;
	
	/**排列顺序*/
	private int rankOrder ;
	
	/**是否有效 0：有效，1：无效*/
	private int status = 0 ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getResFoodId() {
		return resFoodId;
	}

	public void setResFoodId(int resFoodId) {
		this.resFoodId = resFoodId;
	}

	public String getResFoodImg() {
		return resFoodImg;
	}

	public void setResFoodImg(String resFoodImg) {
		this.resFoodImg = resFoodImg;
	}

	public int getRankOrder() {
		return rankOrder;
	}

	public void setRankOrder(int rankOrder) {
		this.rankOrder = rankOrder;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}