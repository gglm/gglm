package com.wjtcy.gglm.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjtcy.gglm.manager.server.GoodsService;
import com.wjtcy.gglm.manager.show.GoodsDetailShow;
import com.wjtcy.utils.NumberUtils;

@Controller
public class Index2Controller {
	
	@Resource
	private GoodsService goodsServiceImpl ;

	@RequestMapping("index.html")
	public String index(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap) {
		
		return "index";
	}
	
	@RequestMapping("goodsList.html")
	public String goodsList(HttpServletRequest request,
			HttpServletResponse response,ModelMap modelMap){
		int cityId = 100,areaId = 100 ;
		String pageNoStr = request.getParameter("pageNo") ;
		String pageCount = request.getParameter("pageSize") ;
		int pageNo = NumberUtils.parseInt(pageNoStr, 1) ;
		int pageSize = NumberUtils.parseInt(pageCount, 5) ;
		List<GoodsDetailShow> goodsList = goodsServiceImpl.getGoodsList(cityId, areaId, pageNo, pageSize) ;
		modelMap.put("goodsList", goodsList) ;
		return "goods/goodsList" ;
	}
	
	@RequestMapping("goodsDetail.html")
	public String goodsDetail( HttpServletRequest request,
			HttpServletResponse response,ModelMap modelMap ){
		String goodsIdStr = request.getParameter("id") ;
		int goodsId = NumberUtils.parseInt(goodsIdStr, 0) ;
		GoodsDetailShow goods = goodsServiceImpl.getGoodsDetail(goodsId) ;
		modelMap.put("goodsDetail", goods) ;
		return "goods/goodsDetail" ;
	}
	
	@RequestMapping("goodsMission.html")
	public String goodsMission( HttpServletRequest request,
			HttpServletResponse response,ModelMap modelMap ){
		
		return "mission/goodsMission" ;
	}
}
