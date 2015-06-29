package com.wjtcy.gglm.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

public class Index2Controller {

	@RequestMapping("index.html")
	public String index(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap) {
		
		return "index";
	}
}
