package com.wjtcy.utils;

import com.wjtcy.gglm.manager.bean.AdAdminBean;
import com.wjtcy.gglm.manager.bean.ResBean;
import com.wjtcy.gglm.manager.form.RegAdAdminForm;
import com.wjtcy.gglm.manager.form.RegResForm;

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
	
	public static ResBean covert( RegResForm form ){
		ResBean bean = new ResBean() ;
		bean.setResAddr(form.getResAddr());
		bean.setResName(form.getResName());
		bean.setResOwner(form.getResOwner());
		bean.setResPhone(form.getResPhone());
		return bean ;
	}
}
