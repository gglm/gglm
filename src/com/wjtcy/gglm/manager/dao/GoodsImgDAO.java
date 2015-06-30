package com.wjtcy.gglm.manager.dao;

import java.util.List;
import java.util.Map;

import com.wjtcy.gglm.manager.bean.GoodsImgBean;

public interface GoodsImgDAO {

	
	/**
	 * 添加商品图片链接
	 * @param goodsImg
	 * @return
	 */
	public int addGoodsImg( GoodsImgBean goodsImg ) ;
	
	/**
	 * 获取图片列表
	 * @param params
	 * @return
	 */
	public List<GoodsImgBean> getGoodsImgList( Map<String,Object> params ) ;
	
	/**
	 * 根据商品id获取商品图片
	 * @param params
	 * @return
	 */
	public List<GoodsImgBean> getGoodsImgListByGoodsId( Map<String,Object> params ) ;
}
