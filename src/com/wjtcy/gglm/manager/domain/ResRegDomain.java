package com.wjtcy.gglm.manager.domain;

import com.wjtcy.gglm.manager.bean.ResBean;
import com.wjtcy.gglm.manager.dao.ResDAO;
import com.wjtcy.gglm.manager.form.RegResForm;
import com.wjtcy.utils.ModelConvert;

public class ResRegDomain {
	
	private ResDAO resDAO ;
	
	private ResBean resBean ;
	
	public ResRegDomain(ResDAO resDAO) {
		this.resDAO = resDAO ;
	}

	public int regRes(RegResForm form){
		ResBean bean = ModelConvert.covert(form) ;
		int row = resDAO.regRes(bean) ;
		if( row == 1 ){
			resBean = bean ;
			return 0 ;	
		}
		return 1 ;
	}
	
	public ResBean getResBean(){
		return resBean ;
	}
}
