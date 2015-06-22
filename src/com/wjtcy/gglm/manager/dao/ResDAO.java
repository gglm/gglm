package com.wjtcy.gglm.manager.dao;

import java.util.List;
import java.util.Map;

import com.wjtcy.gglm.manager.bean.ResBean;

public interface ResDAO {

	public int regRes( ResBean bean ) ;
	
	public List<ResBean> getResList( Map<String,Object> params ) ;
	
	public ResBean getResById( Map<String,Object> params ) ;
}
