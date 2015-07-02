package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;

/**
 * 广告详情
 * @author lyg
 *
 */
public class AdDetailBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2610146787481967244L;

	private Integer id ;

	/** 广告类型 */
	private Integer col ;
	
	/** 广告内容 */
	private String content ;
	
	/** 首页图片地址 */
	private String headImg ;
	
	/** 是否通过审核，0未通过，1通过 */
	private Integer isConfirm = 0 ;
	
	/** 是否有效1：无效，0：有效 */
	private Integer status = 0 ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCol() {
		return col;
	}

	public void setCol(Integer col) {
		this.col = col;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
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
