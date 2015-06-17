package com.wjtcy.gglm.manager.server;

import com.wjtcy.gglm.manager.form.RegResForm;

public interface ResService {

	/**
	 * 饭店商家注册
	 * @param res
	 * @return
	 */
	public int regRes(RegResForm res) ;
	
	
	/**
	 * 饭店菜品添加
	 * @return
	 */
	public int addResMenu( ) ;
	
}
