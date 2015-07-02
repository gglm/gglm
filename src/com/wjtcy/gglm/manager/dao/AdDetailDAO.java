package com.wjtcy.gglm.manager.dao;

import java.util.Map;

import com.wjtcy.gglm.manager.bean.AdDetailBean;

public interface AdDetailDAO {
	
	/**
	 * 获取广告详情
	 * @param params
	 * @return
	 */
	public AdDetailBean getAdDetailById( Map<String,Object> params ) ;

}
