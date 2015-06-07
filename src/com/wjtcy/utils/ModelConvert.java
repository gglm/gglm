package com.wjtcy.utils;

import com.wjtcy.gglm.manager.bean.AdAdminBean;
import com.wjtcy.gglm.manager.form.RegAdAdminForm;

public class ModelConvert {
	
	/**
	 * 表单对象转换为数据库对象
	 * @param form
	 * @return
	 */
	public static AdAdminBean covert(RegAdAdminForm form){
		AdAdminBean bean = new AdAdminBean() ;
		bean.setMobile(form.getMobile());
		bean.setPassword(PasswordUtil.encPassword(form.getAdPassword()));
		bean.setRealName(form.getAdRealName());
		bean.setUserName(form.getAdUserName());
		bean.setPswComplexity(PasswordUtil.pswdStrength(form.getAdPassword()));
		return bean ;
	}
}
