package com.wjtcy.gglm.manager.dao;

import java.util.List;
import java.util.Map;

import com.wjtcy.gglm.manager.bean.ResFoodImgBean;

public interface ResFoodImgDAO {
	
	/**
	 * 添加图片
	 * @param img
	 * @return
	 */
	public int addFoodImg( ResFoodImgBean img ) ;

	/**
	 * 根据食物id获取食物图片
	 * @param params
	 * @return
	 */
	public List<ResFoodImgBean> getResFoodImgByFoodId(Map<String,Object> params) ;
}
