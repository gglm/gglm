package com.wjtcy.gglm.manager.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjtcy.gglm.manager.form.RegAdAdminForm;
import com.wjtcy.gglm.manager.server.AdAdminService;

@Controller
public class AdAdminController {
	
	@Resource
	private AdAdminService adAdminServiceImpl ;

	@RequestMapping("ad/adAdminReg.no")
	public String regAdAdmin(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap,RegAdAdminForm form) {
		String webrootPath = request.getRealPath("/");
		int errorCode = adAdminServiceImpl.regAdAdmin(form,webrootPath) ;
		if( errorCode == 0 ){
			return "ad/regSuccess" ;
		}else{
			modelMap.put("errorCode", errorCode) ;
			return "ad/regFail" ;
		}
	}

	@RequestMapping("ad/gotoAdAdminReg.no")
	public String gotoRegAdAdmin(){
		
		return "ad/adAdminReg" ;
	}
}
