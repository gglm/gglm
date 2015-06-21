package com.wjtcy.gglm.manager.server.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wjtcy.gglm.manager.bean.ResFoodImgBean;
import com.wjtcy.gglm.manager.dao.ResFoodImgDAO;
import com.wjtcy.gglm.manager.server.ResFoodImgService;

@Service
public class ResFoodImgServiceImpl implements ResFoodImgService {
	
	@Resource
	private ResFoodImgDAO resFoodImgDAO ;

	@Override
	public List<ResFoodImgBean> getFoodImgByFoodId(int foodId) {
		Map<String,Object> params = new HashMap<String,Object>() ;
		params.put("foodId", foodId) ;
		params.put("status", 0) ;
		return null;
	}

}
