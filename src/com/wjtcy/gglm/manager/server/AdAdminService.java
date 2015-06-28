package com.wjtcy.gglm.manager.server;

import java.util.List;

import com.wjtcy.gglm.manager.bean.AdAdminBean;
import com.wjtcy.gglm.manager.domain.AdAdminRegDomain;
import com.wjtcy.gglm.manager.form.RegAdAdminForm;

public interface AdAdminService {

	/**
	 * 广告主注册
	 * @param form
	 * @return
	 */
	public AdAdminRegDomain regAdAdmin(RegAdAdminForm form,String rootPath) ;
	
	/**
	 * 获取未审核通过的广告主
	 * @return
	 */
	public List<AdAdminBean> getNuapprAdAdmin() ;
	
	/**
	 * 更新广告主为已审核
	 * @param id
	 * @return
	 */
	public int updateAdAdminConfirm(int id) ;
}
