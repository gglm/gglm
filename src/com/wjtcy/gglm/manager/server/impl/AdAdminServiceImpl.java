package com.wjtcy.gglm.manager.server.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wjtcy.gglm.manager.dao.AdAdminDAO;
import com.wjtcy.gglm.manager.domain.AdAdminRegDomain;
import com.wjtcy.gglm.manager.form.RegAdAdminForm;
import com.wjtcy.gglm.manager.server.AdAdminService;

@Service
public class AdAdminServiceImpl implements AdAdminService {
	
	@Resource
	private AdAdminDAO adAdminDAO ;

	@Override
	public int regAdAdmin(RegAdAdminForm form) {
		AdAdminRegDomain domain = new AdAdminRegDomain(adAdminDAO) ;
		int errorCode = domain.regAdAdmin( form ) ;
		return errorCode ;
	}

}
