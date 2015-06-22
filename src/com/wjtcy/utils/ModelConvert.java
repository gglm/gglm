package com.wjtcy.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.wjtcy.gglm.manager.bean.AdAdminBean;
import com.wjtcy.gglm.manager.bean.ResBean;
import com.wjtcy.gglm.manager.bean.ResMenuBean;
import com.wjtcy.gglm.manager.encrypt.Encrypt;
import com.wjtcy.gglm.manager.form.AddResMenuForm;
import com.wjtcy.gglm.manager.form.RegAdAdminForm;
import com.wjtcy.gglm.manager.form.RegResForm;
import com.wjtcy.gglm.manager.show.ResMenuShow;
import com.wjtcy.gglm.manager.show.ResShow;

public class ModelConvert {
	
	/**
	 * 表单对象转换为数据库对象
	 * @param form
	 * @return
	 */
	public static AdAdminBean convert(RegAdAdminForm form){
		AdAdminBean bean = new AdAdminBean() ;
		bean.setMobile(form.getMobile());
		bean.setPassword(PasswordUtil.encPassword(form.getAdPassword()));
		bean.setRealName(form.getAdRealName());
		bean.setUserName(form.getAdUserName());
		bean.setPswComplexity(PasswordUtil.pswdStrength(form.getAdPassword()));
		return bean ;
	}
	
	public static ResBean convert( RegResForm form ){
		ResBean bean = new ResBean() ;
		bean.setCityId(Integer.parseInt(form.getCityId()));
		bean.setAreaId(Integer.parseInt(form.getAreaId()));
		bean.setResAddr(form.getResAddr());
		bean.setResName(form.getResName());
		bean.setResOwner(form.getResOwner());
		bean.setResPhone(form.getResPhone());
		return bean ;
	}
	
	public static ResShow convert( ResBean resBean ){
		ResShow show = new ResShow() ;
		BeanUtils.copyProperties(resBean, show);
		return show ;
	}
	
	public static List<ResShow> convert( List<ResBean> resList ){
		List<ResShow> resShowList = new ArrayList<ResShow>() ;
		if( null != resList ){
			for( ResBean res : resList ){
				ResShow show = convert(res) ;
				resShowList.add(show) ;
			}
		}
		return resShowList ;
	}
	
	public static ResMenuBean convert( AddResMenuForm form ){
		ResMenuBean menu = new ResMenuBean() ;
		String resIdEnc = form.getResId() ;
		try{
			Encrypt enc = new Encrypt() ;
			String resIdS = enc.decrypt(resIdEnc) ;
			int resId = Integer.parseInt(resIdS) ;
			menu.setResId(resId) ;
			menu.setCostPrice(new BigDecimal(form.getCostPrice())) ;
			menu.setFoodCuisine(form.getFoodCuisine()) ;
			menu.setFoodDesc(form.getFoodDesc()) ;
			menu.setFoodName(form.getFoodName()) ;
			menu.setOriPrice(new BigDecimal(form.getOriPrice())) ;
			menu.setStatus(0) ; 
		} catch( Exception e ){
			e.printStackTrace() ;
		}
		return menu ;
	}
	
	public static ResMenuShow convert( ResMenuBean bean ){
		ResMenuShow show = new ResMenuShow() ;
		BeanUtils.copyProperties(bean, show);
		return show ;
	}
	
	public static List<ResMenuShow> convertResMenu( List<ResMenuBean> beanList,ResShow resShow ){
		if( null == beanList ){
			return null ;
		}
		List<ResMenuShow> showList = new ArrayList<ResMenuShow>() ;
		for( ResMenuBean bean : beanList ){
			ResMenuShow show = convert(bean) ;
			show.setResShow(resShow) ;
			showList.add(show) ;
		}
		return showList ;
	}
}
