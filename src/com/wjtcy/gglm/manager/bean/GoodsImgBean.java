package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;

public class GoodsImgBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4857295300583503691L;

	private Integer id ; 
	
	/** 对应的商品id */
	private Integer goodsId ; 
	
	/** 图片地址 */
	private String imgUri ;
	
	/** 排列顺序 */
	private Integer rankOrder ;
	
	/** 图片类型，1：普通大小，2：缩略图 */
	private Integer type ; 

	/** 是否有效 0：有效，1：无效 */
	private Integer status ;

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

	public String getImgUri() {
		return imgUri;
	}

	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}

	public Integer getRankOrder() {
		return rankOrder;
	}

	public void setRankOrder(Integer rankOrder) {
		this.rankOrder = rankOrder;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
