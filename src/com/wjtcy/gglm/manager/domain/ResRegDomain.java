package com.wjtcy.gglm.manager.domain;

import com.wjtcy.gglm.manager.bean.ResBean;
import com.wjtcy.gglm.manager.dao.ResDAO;
import com.wjtcy.gglm.manager.form.RegResForm;
import com.wjtcy.utils.ModelConvert;

public class ResRegDomain {
	
	private ResDAO resDAO ;
	
	private ResBean resBean ;
	
	private RegResForm form ;
	
	public ResRegDomain(ResDAO resDAO,RegResForm form) {
		this.resDAO = resDAO ;
		this.form = form ;
	}

	public int regRes(){
		ResBean bean = ModelConvert.convert(form) ;
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
