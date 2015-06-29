package com.wjtcy.gglm.manager.server.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wjtcy.gglm.manager.bean.GoodsDetailBean;
import com.wjtcy.gglm.manager.bean.GoodsImgBean;
import com.wjtcy.gglm.manager.dao.GoodsDetailDAO;
import com.wjtcy.gglm.manager.dao.GoodsImgDAO;
import com.wjtcy.gglm.manager.server.GoodsService;
import com.wjtcy.gglm.manager.show.GoodsDetailShow;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Resource
	private GoodsDetailDAO goodsDetailDAO ;
	
	@Resource
	private GoodsImgDAO goodsImgDAO ;

	@Override
	public List<GoodsDetailShow> getGoodsList(Integer cityId,Integer areaId ,int pageNo,int pageCount ) {
		List<GoodsDetailShow> goodsShowList = new ArrayList<GoodsDetailShow>() ;
		Map<String,Object> params = new HashMap<String,Object>() ;
		if( null != cityId ){
			params.put("cityId", cityId) ;
			if( null != areaId ){
				params.put("areaId", areaId) ;
			}
		}
		params.put("status", 0) ;
		params.put("isConfirm", 1) ;
		int offset = (pageNo - 1) * pageCount ; 
		params.put("offset", offset );
		params.put("rows", pageCount) ;
		List<GoodsDetailBean> goodsList = goodsDetailDAO.getGoodsDetailList(params) ;
		if( goodsList != null && goodsList.size() > 0 ){
			List<Integer> goodsIdList = new ArrayList<Integer>() ;
			Map<Integer,GoodsDetailBean> goodsDetailMap = new HashMap<Integer,GoodsDetailBean>() ;
			for( GoodsDetailBean goods : goodsList ){
				goodsIdList.add(goods.getId()) ;
				goodsDetailMap.put(goods.getId(), goods) ;
			}
			Map<String,Object> imgParams = new HashMap<String,Object>() ;
			imgParams.put("status", 0) ;
			imgParams.put("goodsIdList", goodsIdList) ;
			List<GoodsImgBean> goodsImgList = goodsImgDAO.getGoodsImgList(imgParams) ;
			Map<Integer,List<GoodsImgBean>> goodsImgMap = new HashMap<Integer,List<GoodsImgBean>>() ;
			if( null != goodsImgList ){
				for( GoodsImgBean goodsImg : goodsImgList ){
					Integer goodsId = goodsImg.getGoodsId() ;
					List<GoodsImgBean> gImgList = goodsImgMap.get(goodsId) ;
					if( null == gImgList ){
						gImgList = new ArrayList<GoodsImgBean>() ;
						goodsImgMap.put(goodsId, gImgList) ;
					}
					gImgList.add(goodsImg) ;
				}
			}
			for( Integer goodsId : goodsDetailMap.keySet() ){
				GoodsDetailBean g = goodsDetailMap.get(goodsId) ;
				GoodsDetailShow goodsShow = new GoodsDetailShow() ;
				goodsShow.setGoodsDetail(g) ;
				goodsShow.setGoodsImgList(goodsImgMap.get(goodsId));
			}
			
		}
		return goodsShowList ;
	}

}
