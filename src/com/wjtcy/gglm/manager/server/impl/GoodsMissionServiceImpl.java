package com.wjtcy.gglm.manager.server.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wjtcy.gglm.manager.bean.GoodsMissionBean;
import com.wjtcy.gglm.manager.dao.AdDetailDAO;
import com.wjtcy.gglm.manager.dao.GoodsMissionDAO;
import com.wjtcy.gglm.manager.server.GoodsMissionService;
import com.wjtcy.gglm.manager.show.GoodsMissionShow;
import com.wjtcy.utils.TimeUtils;

@Service
public class GoodsMissionServiceImpl implements GoodsMissionService {
	
	@Resource
	private GoodsMissionDAO goodsMissionDAO ;
	
	@Resource
	private AdDetailDAO adDetailDAO ;

	@Override
	public List<GoodsMissionShow> getGoodsMissionList(int pageNo, int pageSize) {
		int offset = (pageNo - 1) * pageSize ;
		Map<String,Object> params = new HashMap<String,Object>() ;
		params.put("isConfirm", 1) ;
		params.put("status", 0) ;
		long timeNow = TimeUtils.getCurrentTimeMillis() ;
		Timestamp t = new Timestamp(timeNow) ;
		params.put("timeNow", t) ;
		params.put("offset", offset) ;
		params.put("row", pageSize) ;
		List<GoodsMissionBean> goodsMissionList = goodsMissionDAO.getGoodsMissionList(params) ;
		if( null != goodsMissionList ){
			for( GoodsMissionBean goodsMission : goodsMissionList ){
				int goodsId = goodsMission.getGoodsId() ;
				
			}
		}
		return null;
	}

	
}
