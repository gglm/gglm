package com.wjtcy.gglm.manager.server;

import java.util.List;

import com.wjtcy.gglm.manager.form.AddResMenuForm;
import com.wjtcy.gglm.manager.form.RegResForm;
import com.wjtcy.gglm.manager.show.ResMenuShow;
import com.wjtcy.gglm.manager.show.ResShow;

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
	public int addResMenu( AddResMenuForm form ) ;
	
	/**
	 * 根据城市id和商圈id获取饭店信息列表
	 * @param cityId
	 * @param areaId
	 * @return
	 */
	public List<ResShow> getResList(int cityId,int areaId) ;
	
	/**
	 * 根据饭店id获取食物列表
	 * @param resId
	 * @return
	 */
	public List<ResMenuShow> getResMenuList( int resId ) ;
	
	/**
	 * @return
	 */
	public List<ResMenuShow> getResMenuList() ;
	
}
