package com.wjtcy.gglm.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjtcy.gglm.manager.encrypt.Encrypt;
import com.wjtcy.gglm.manager.server.ResService;
import com.wjtcy.gglm.manager.show.ResMenuShow;

@Controller
public class IndexController {

	@Resource
	private ResService resServiceImpl ;
	
	@RequestMapping("index.html")
	public String index(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap) {
		
		return "index";
	}

	@RequestMapping("res/resMenuList.no")
	public String menuList(HttpServletRequest request,
			HttpServletResponse response,ModelMap modelMap){
		String resIdEnc = request.getParameter("resId") ;
		try{
			Encrypt enc = new Encrypt() ;
			String resIdS = enc.decrypt(resIdEnc) ;
			int resId = Integer.parseInt(resIdS) ;
			List<ResMenuShow> showList = resServiceImpl.getResMenuList() ;
			modelMap.put("resMenuList", showList) ;
		}catch( Exception e ){
			e.printStackTrace() ;
		}
		return "res/menuList" ;
	}
}
