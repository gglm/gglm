package com.wjtcy.gglm.manager.show;

import java.sql.Timestamp;
import java.util.List;

import com.wjtcy.gglm.manager.bean.AdDetailBean;
import com.wjtcy.gglm.manager.bean.GoodsDetailBean;

public class GoodsMissionShow {
	
	private Integer id ;
	
	/** 对应商品id */
	private Integer goodsId ;

	/** 商品免费所售个数 */
	private Integer goodsNum ;
	
	/** 起始事件 */
	private Timestamp startTime ;
	
	/** 结束时间 */
	private Timestamp endTime ;

	private GoodsDetailBean goodsDetail ;
	
	private List<AdDetailBean> adDetailList ;
	
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

	public GoodsDetailBean getGoodsDetail() {
		return goodsDetail;
	}

	public void setGoodsDetail(GoodsDetailBean goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public List<AdDetailBean> getAdDetailList() {
		return adDetailList;
	}

	public void setAdDetailList(List<AdDetailBean> adDetailList) {
		this.adDetailList = adDetailList;
	}
	
	
}
