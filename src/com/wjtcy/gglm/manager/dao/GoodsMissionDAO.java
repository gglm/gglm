package com.wjtcy.gglm.manager.dao;

import java.util.List;
import java.util.Map;

import com.wjtcy.gglm.manager.bean.GoodsMissionBean;

public interface GoodsMissionDAO {

	/**
	 * 获取有任务的商品id以及对应广告信息列表
	 * @param params
	 * @return
	 */
	public List<GoodsMissionBean> getGoodsMissionList( Map<String,Object> params ) ;
}
