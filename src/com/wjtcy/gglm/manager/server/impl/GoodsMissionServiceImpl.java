package com.wjtcy.gglm.manager.server.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wjtcy.gglm.manager.bean.AdDetailBean;
import com.wjtcy.gglm.manager.bean.GoodsDetailBean;
import com.wjtcy.gglm.manager.bean.GoodsMissionBean;
import com.wjtcy.gglm.manager.bean.GoodsMissionDetailBean;
import com.wjtcy.gglm.manager.dao.AdDetailDAO;
import com.wjtcy.gglm.manager.dao.GoodsDetailDAO;
import com.wjtcy.gglm.manager.dao.GoodsMissionDAO;
import com.wjtcy.gglm.manager.dao.GoodsMissionDetailDAO;
import com.wjtcy.gglm.manager.server.GoodsMissionService;
import com.wjtcy.gglm.manager.show.GoodsMissionShow;
import com.wjtcy.utils.TimeUtils;

@Service
public class GoodsMissionServiceImpl implements GoodsMissionService {
	
	@Resource
	private GoodsMissionDAO goodsMissionDAO ;
	
	@Resource
	private AdDetailDAO adDetailDAO ;
	
	@Resource
	private GoodsDetailDAO goodsDetailDAO ;

	@Resource
	private GoodsMissionDetailDAO goodsMissionDetailDAO ;
	
	/* (non-Javadoc)
	 * @see com.wjtcy.gglm.manager.server.GoodsMissionService#getGoodsMissionList(int, int)
	 */
	@Override
	public List<GoodsMissionShow> getGoodsMissionList(int pageNo, int pageSize) {
		List<GoodsMissionShow> missionShowList = new ArrayList<GoodsMissionShow>() ;
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
				GoodsMissionShow missionShow = new GoodsMissionShow() ;
				int goodsId = goodsMission.getGoodsId() ;
				Map<String,Object> goodsParams = new HashMap<String,Object>() ;
				goodsParams.put("status", 0 ) ;
				goodsParams.put( "isConfirm", 1 ) ;
				goodsParams.put("goodsId", goodsId) ;
				GoodsDetailBean goodsDetail = goodsDetailDAO.getGoodsDetailById(goodsParams) ;
				missionShow.setGoodsDetail(goodsDetail) ;
				Map<String,Object> missionDetailParams = new HashMap<String,Object>() ;
				missionDetailParams.put("status", 0) ;
				missionDetailParams.put("goodsMissionId", goodsMission.getId() ) ;
				List<GoodsMissionDetailBean> misDetailList = goodsMissionDetailDAO.getGoodsMissionDetailList(missionDetailParams) ;
				missionShow.setGoodsMissionDetailList(misDetailList);
				if( null != misDetailList ){
					List<AdDetailBean> adList = new ArrayList<AdDetailBean>() ;
					for( GoodsMissionDetailBean gmdb : misDetailList ){
						Map<String,Object> adParams = new HashMap<String,Object>() ;
						adParams.put("status", 0 ) ;
						adParams.put("goodsMissionId", gmdb.getAdId()) ;
						adList.add( adDetailDAO.getAdDetailById(adParams) ) ;
					}
					missionShow.setAdDetailList(adList);
				}
				missionShowList.add(missionShow) ;
			}
		}
		return missionShowList ;
	}

	
}
