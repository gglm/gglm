package com.wjtcy.gglm.manager.show;

import java.util.List;

import com.wjtcy.gglm.manager.bean.GoodsDetailBean;
import com.wjtcy.gglm.manager.bean.GoodsImgBean;

public class GoodsDetailShow {

	private GoodsDetailBean goodsDetail ;
	
	private List<GoodsImgBean> goodsImgList ;

	public GoodsDetailBean getGoodsDetail() {
		return goodsDetail;
	}

	public void setGoodsDetail(GoodsDetailBean goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public List<GoodsImgBean> getGoodsImgList() {
		return goodsImgList;
	}

	public void setGoodsImgList(List<GoodsImgBean> goodsImg) {
		this.goodsImgList = goodsImg;
	}
	
}
