package com.wjtcy.gglm.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("index.html")
	public String index(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap) {
		
		return "index";
	}
}
