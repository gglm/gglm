package com.wjtcy.gglm.manager.dao;

import java.util.List;
import java.util.Map;

import com.wjtcy.gglm.manager.bean.AdAdminBean;

public interface AdAdminDAO {

	/**
	 * 插入广告主
	 * @param bean
	 * @return
	 */
	public int addAdAdmin( AdAdminBean bean ) ;
	
	
	/**
	 * @param params
	 * @return
	 */
	public List<AdAdminBean> getUnapprAdAdmin( Map<String,Object> params ) ;
	
	/**
	 * 审核状态修改为1
	 * @param id
	 * @return
	 */
	public int updateAdAdminConfirm( int id ) ;
}
