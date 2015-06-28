package com.wjtcy.gglm.manager.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjtcy.gglm.manager.form.AddResMenuForm;
import com.wjtcy.gglm.manager.form.RegResForm;
import com.wjtcy.gglm.manager.server.ResService;
import com.wjtcy.gglm.manager.show.ResShow;

/**
 * 饭店信息管理
 * @author lyg
 *
 */
@Controller
public class RestaurantsController {
	
	@Resource 
	private ResService resServiceImpl ;
	
	@RequestMapping("res/gotoAddRes.no")
	public String gotoAddRes(){
		
		return "res/addRes" ;
	}
	
	@RequestMapping("res/addRes.no")
	public String addRes(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap,RegResForm form){
		int errorCode = resServiceImpl.regRes(form) ;
		if( errorCode == 0 ){
			String cityIdStr = form.getCityId() ;
			String areaIdStr = form.getAreaId() ;
			int cityId = Integer.parseInt(cityIdStr) ;
			int areaId = Integer.parseInt(areaIdStr) ;
			List<ResShow> resList = resServiceImpl.getResList(cityId, areaId) ;
			
			modelMap.put("resList", resList) ;
			return "res/resList" ;
		}else{
			modelMap.put("errorCode", errorCode) ;
			return "res/addFail" ;
		}
	}
	
	@RequestMapping("res/resList.no")
	public String resList(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap){
		String cityIdStr = request.getParameter("cityId") ;
		String areaIdStr = request.getParameter("areaId") ;
		int cityId = Integer.parseInt(cityIdStr) ;
		int areaId = Integer.parseInt(areaIdStr) ;
		List<ResShow> resList = resServiceImpl.getResList(cityId, areaId) ;
		modelMap.put("resList", resList) ;
		return "res/resList" ;
	}
	
	@RequestMapping("res/gotoAddMenu.no")
	public String gotoAddMenu(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap){
		String resId = request.getParameter("resId") ;
		modelMap.put("resId", resId) ;
		return "res/addMenu" ;
	}
	
	@RequestMapping("res/addMenu.no")
	public String addMenu(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap,AddResMenuForm form){
		int errorCode = resServiceImpl.addResMenu(form) ;
		if( errorCode == 0 ){
			return "res/addSuccess" ;
		}
		return "res/addFail" ;
	}
	
}
