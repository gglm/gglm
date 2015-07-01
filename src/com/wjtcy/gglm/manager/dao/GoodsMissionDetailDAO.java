package com.wjtcy.gglm.manager.dao;

import java.util.List;
import java.util.Map;

import com.wjtcy.gglm.manager.bean.GoodsMissionDetailBean;

public interface GoodsMissionDetailDAO {

	/**
	 * 根据商品id和商品广告id获取广告详情
	 * 
	 * @param params
	 * @return
	 */
	public List<GoodsMissionDetailBean> getGoodsMissionDetailList(
			Map<String, Object> params);
}
