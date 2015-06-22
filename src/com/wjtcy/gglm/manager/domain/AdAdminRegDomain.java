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
	private AdAdminBean adAdminBean ;
	
	private RegAdAdminForm regAdminForm ;
	
	public AdAdminRegDomain( AdAdminDAO adAdminDAO ,RegAdAdminForm form ){
		this.adAdminDAO = adAdminDAO ;
		this.regAdminForm = form ;
	}
	
	private int formVerify(){
		if( StringUtils.isEmpty(regAdminForm.getAdUserName()) ){
			return 1 ;
		}
		if( regAdminForm.getAdUserName().length() < 2 || regAdminForm.getAdUserName().length() > 30 ){
			return 2 ;
		}
		if( StringUtils.isEmpty(regAdminForm.getAdRealName()) ){
			return 3 ;
		}
		if( regAdminForm.getAdRealName().length() < 2 || regAdminForm.getAdRealName().length() > 30 ){
			return 4 ;
		}
		if( StringUtils.isEmpty(regAdminForm.getAdPassword()) ){
			return 5 ;
		}
		if( regAdminForm.getAdPassword().length() < 6 || regAdminForm.getAdPassword().length() > 20 ){
			return 6 ;
		}
		
		if( StringUtils.isEmpty(regAdminForm.getConfirmPassword()) ){
			return 7 ;
		}
		if( !regAdminForm.getConfirmPassword().equals(regAdminForm.getAdPassword() ) ){
			return 8 ;
		}
		if( StringUtils.isEmpty(regAdminForm.getMobile()) ){
			return 9 ;
		}
		if( !PhoneNumUtil.checkCellPhoneNum(regAdminForm.getMobile()) ){
			return 10 ;
		}
		
		return 0 ;
	}
	
	public int regAdAdmin(){
		int errorCode = formVerify() ;
		if( errorCode != 0 ){
			return errorCode ;
		}
		AdAdminBean bean = ModelConvert.convert(regAdminForm) ;
		int row = adAdminDAO.addAdAdmin(bean) ;
		if( row == 1 ){
			this.adAdminBean = bean ;
			return 0 ;
		}
		return 11 ;
	}
	
	public AdAdminBean getAdAdminBean(){
		return adAdminBean ;
	}
}
