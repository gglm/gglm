package com.wjtcy.gglm.manager.dao;

import java.util.List;
import java.util.Map;

import com.wjtcy.gglm.manager.bean.ResMenuBean;

public interface ResMenuDAO {

	/**
	 * 添加菜单项
	 * @param bean
	 * @return
	 */
	public int addResMenu( ResMenuBean bean ) ;
	
	/**
	 * 按条件查询
	 * @param params
	 * @return
	 */
	public List<ResMenuBean> getResMenuList( Map<String,Object> params) ;
}
