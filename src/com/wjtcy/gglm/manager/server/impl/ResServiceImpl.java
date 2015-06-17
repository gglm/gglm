package com.wjtcy.gglm.manager.server.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wjtcy.gglm.manager.dao.ResDAO;
import com.wjtcy.gglm.manager.domain.ResRegDomain;
import com.wjtcy.gglm.manager.form.RegResForm;
import com.wjtcy.gglm.manager.server.ResService;


@Service
public class ResServiceImpl implements ResService{
	
	@Resource
	private ResDAO resDAO ;

	@Override
	public int regRes(RegResForm res) {
		ResRegDomain domain = new ResRegDomain( resDAO ) ;
		int errorCode = domain.regRes(res) ;
		if( errorCode == 0 ){
			//添加地址信息
			//TODO
		}
		
		return 0;
	}

	@Override
	public int addResMenu() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
