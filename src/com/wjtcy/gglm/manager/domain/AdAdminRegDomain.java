package com.wjtcy.gglm.manager.domain;

import org.springframework.util.StringUtils;

import com.wjtcy.gglm.manager.bean.AdAdminBean;
import com.wjtcy.gglm.manager.dao.AdAdminDAO;
import com.wjtcy.gglm.manager.form.RegAdAdminForm;
import com.wjtcy.utils.ModelConvert;
import com.wjtcy.utils.PhoneNumUtil;

public class AdAdminRegDomain {

	private AdAdminDAO adAdminDAO ;
	
	/**中间结果*/
	AdAdminBean adAdminBean ;
	
	public AdAdminRegDomain( AdAdminDAO adAdminDAO ){
		this.adAdminDAO = adAdminDAO ;
	}
	
	private int formVerify(RegAdAdminForm form){
		if( StringUtils.isEmpty(form.getAdUserName()) ){
			return 1 ;
		}
		if( form.getAdUserName().length() < 2 || form.getAdUserName().length() > 30 ){
			return 2 ;
		}
		if( StringUtils.isEmpty(form.getAdRealName()) ){
			return 3 ;
		}
		if( form.getAdRealName().length() < 2 || form.getAdRealName().length() > 30 ){
			return 4 ;
		}
		if( StringUtils.isEmpty(form.getAdPassword()) ){
			return 5 ;
		}
		if( form.getAdPassword().length() < 6 || form.getAdPassword().length() > 20 ){
			return 6 ;
		}
		
		if( StringUtils.isEmpty(form.getConfirmPassword()) ){
			return 7 ;
		}
		if( !form.getConfirmPassword().equals(form.getAdPassword() ) ){
			return 8 ;
		}
		if( StringUtils.isEmpty(form.getMobile()) ){
			return 9 ;
		}
		if( !PhoneNumUtil.checkCellPhoneNum(form.getMobile()) ){
			return 10 ;
		}
		
		return 0 ;
	}
	
	public int regAdAdmin(RegAdAdminForm form){
		int errorCode = formVerify(form) ;
		if( errorCode != 0 ){
			return errorCode ;
		}
		AdAdminBean bean = ModelConvert.covert(form) ;
		int row = adAdminDAO.addAdAdmin(bean) ;
		if( row == 1 ){
			this.adAdminBean = bean ;
			return 0 ;
		}
		return 11 ;
	}
}
