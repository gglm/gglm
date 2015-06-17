package com.wjtcy.gglm.manager.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjtcy.gglm.manager.form.RegResForm;
import com.wjtcy.gglm.manager.server.ResService;

/**
 * 饭店信息管理
 * @author lyg
 *
 */
@Controller
public class RestaurantsController {
	
	@Resource 
	private ResService resServiceImpl ;
	
	@RequestMapping("res/addRes.no")
	public String addRes(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap,RegResForm form){
		int errorCode = resServiceImpl.regRes(form) ;
		
		return null ;
	}
	
	@RequestMapping("res/addMenu.no")
	public String addMenu(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap){
		
		return null ;
	}
}
