package com.wjtcy.gglm.manager.dao;

import java.util.List;
import java.util.Map;

import com.wjtcy.gglm.manager.bean.GoodsDetailBean;

public interface GoodsDetailDAO {

	/**
	 * 添加商品详情
	 * @param goodsDetail
	 * @return
	 */
	public int addGoodsDetail( GoodsDetailBean goodsDetail ) ;
	
	
	/**
	 * 获取商品详情
	 * @param params
	 * @return
	 */
	public List<GoodsDetailBean> getGoodsDetailList( Map<String,Object> params ) ;
}
