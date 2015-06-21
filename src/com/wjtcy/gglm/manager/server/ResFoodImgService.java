package com.wjtcy.gglm.manager.server;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wjtcy.gglm.manager.bean.ResFoodImgBean;

@Service
public interface ResFoodImgService {

	/**
	 * 根据食品id获取食品图片
	 * @param foodId
	 * @return
	 */
	public List<ResFoodImgBean> getFoodImgByFoodId( int foodId ) ;
}
