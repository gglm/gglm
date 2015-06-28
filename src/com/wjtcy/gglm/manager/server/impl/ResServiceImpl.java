package com.wjtcy.gglm.manager.server.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wjtcy.gglm.manager.bean.ResBean;
import com.wjtcy.gglm.manager.bean.ResMenuBean;
import com.wjtcy.gglm.manager.dao.ResDAO;
import com.wjtcy.gglm.manager.dao.ResMenuDAO;
import com.wjtcy.gglm.manager.domain.ResRegDomain;
import com.wjtcy.gglm.manager.form.AddResMenuForm;
import com.wjtcy.gglm.manager.form.RegResForm;
import com.wjtcy.gglm.manager.server.ResService;
import com.wjtcy.gglm.manager.show.ResMenuShow;
import com.wjtcy.gglm.manager.show.ResShow;
import com.wjtcy.utils.ModelConvert;


@Service
public class ResServiceImpl implements ResService{
	
	@Resource
	private ResDAO resDAO ;
	
	@Resource
	private ResMenuDAO resMenuDAO ;

	@Override
	public int regRes(RegResForm res) {
		ResRegDomain domain = new ResRegDomain( resDAO,res ) ;
		int errorCode = domain.regRes() ;
		if( errorCode == 0 ){
			//添加地址信息
			//TODO
		}
		
		return 0;
	}

	@Override
	public int addResMenu( AddResMenuForm form) {
		ResMenuBean bean = ModelConvert.convert(form) ;
		int errorCode = resMenuDAO.addResMenu(bean) ;
		return errorCode ;
	}
	
	@Override
	public List<ResShow> getResList(int cityId,int areaId) {
		List<ResShow> result = new ArrayList<ResShow>() ;
		Map<String,Object> params = new HashMap<String,Object>() ;
		params.put("cityId", cityId) ;
		params.put("areaId", areaId) ;
		params.put("status", 0) ;
		List<ResBean> resList = resDAO.getResList(params) ;
		if( null != result ){
			result = ModelConvert.convert(resList) ;
		}
		return result ;
	}

	@Override
	public List<ResMenuShow> getResMenuList(int resId) {
		List<ResMenuShow> showList = new ArrayList<ResMenuShow>() ;
		Map<String,Object> params = new HashMap<String,Object>() ;
		ResShow resShow = null ;
		if( resId > 0 ){
			params.put("resId", resId) ;
			ResBean resBean = resDAO.getResById(params) ;
			resShow = ModelConvert.convert(resBean) ;
		}
		params.put("status", 0) ;
		List<ResMenuBean> resMenuBeanList = resMenuDAO.getResMenuList(params) ;
		if( null != resMenuBeanList ){
			showList = ModelConvert.convertResMenu(resMenuBeanList,resShow) ;
		}
		return showList;
	}

	public List<ResMenuShow> getResMenuList(){
		List<ResMenuShow> showList = new ArrayList<ResMenuShow>() ;
		List<ResShow> result = new ArrayList<ResShow>() ;
		Map<String,Object> params = new HashMap<String,Object>() ;
		params.put("cityId", 1) ;
		params.put("areaId", 0) ;
		params.put("status", 0) ;
		List<ResBean> resList = resDAO.getResList(params) ;
		if( null != result ){
			result = ModelConvert.convert(resList) ;
			Map<String,Object> p = new HashMap<String,Object>() ;
			for( ResShow resShow : result ){
				p.put("status", 0) ;
				p.put("resId", resShow.getId()) ;
				List<ResMenuBean> resMenuBeanList = resMenuDAO.getResMenuList(params) ;
				if( null != resMenuBeanList ){
					showList.addAll( ModelConvert.convertResMenu(resMenuBeanList,resShow) ) ;
				}
			}
		}
		return showList ;
	}
}
