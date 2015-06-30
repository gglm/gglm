package com.wjtcy.gglm.manager.server;

import java.util.List;

import com.wjtcy.gglm.manager.show.GoodsDetailShow;


public interface GoodsService {

	/**
	 * 获取商品列表
	 * @param pageNo
	 * @param pageCount
	 * @return
	 */
	public List<GoodsDetailShow> getGoodsList(Integer cityId,Integer areaId,int pageNo,int pageCount) ;

	public GoodsDetailShow getGoodsDetail( int goodsId ) ;
}
