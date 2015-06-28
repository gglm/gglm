package com.wjtcy.gglm.manager.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.wjtcy.gglm.manager.bean.AdAdminBean;
import com.wjtcy.gglm.manager.domain.AdAdminRegDomain;
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
		AdAdminRegDomain domain = adAdminServiceImpl.regAdAdmin(form,webrootPath) ;
		int errorCode = domain.getErrorCode() ;
		if( errorCode == 0 ){
			AdAdminBean adAdminBean = domain.getAdAdminBean() ;
			modelMap.put("adAdminBean", adAdminBean) ;
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
	
	@RequestMapping("ad/gotoAdAdminAppr.no")
	public String gotoAdAdminAppr(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap){
		List<AdAdminBean> adAdminList = new ArrayList<AdAdminBean>() ;
		adAdminList = adAdminServiceImpl.getNuapprAdAdmin() ;
		modelMap.put("adAdminList", adAdminList) ;
		return "ad/adAdminAppr" ;
	}
	
	@RequestMapping("ad/adAdminAppr.no")
	public void adAdminAppr(HttpServletRequest request,
			HttpServletResponse response){
		String idStr = request.getParameter("id") ;
		int id = Integer.parseInt(idStr) ;
		int errorCode = adAdminServiceImpl.updateAdAdminConfirm(id) ;
		Map<String ,Object> result = new HashMap<String,Object>() ;
		result.put("errorCode", errorCode) ;
		String returnStr = JSONObject.toJSONString(result);
		outPrint(response, returnStr);
	}
	
	public String addAd(HttpServletRequest request,
			HttpServletResponse response){
		return "" ;
	}
	
	private void outPrint(HttpServletResponse response, String returnStr) {
		try {
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			out.print(returnStr);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
