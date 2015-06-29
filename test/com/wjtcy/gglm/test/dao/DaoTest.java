package com.wjtcy.gglm.test.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wjtcy.gglm.manager.bean.AdAdminBean;
import com.wjtcy.gglm.manager.bean.GoodsImgBean;
import com.wjtcy.gglm.manager.dao.AdAdminDAO;
import com.wjtcy.gglm.manager.dao.GoodsImgDAO;
import com.wjtcy.utils.PasswordUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/spring/base.xml"})
public class DaoTest {

	@Resource
	private AdAdminDAO adAdminDAO ;
	
	@Resource
	private GoodsImgDAO goodsImgDAO ;
	
	@Test
	public void test1(){
		AdAdminBean bean = new AdAdminBean() ;
		bean.setIsConfirm(1);
		bean.setMobile("18600950120") ;
		String password = PasswordUtil.encPassword("admin") ;
		bean.setPassword(password);
		bean.setType(0);
		bean.setPrivileges("1");
		bean.setRealName("刘永刚");
		bean.setTelephone("010-55503040");
		bean.setUserName("admin");
		int i = adAdminDAO.addAdAdmin(bean) ;
		System.out.println("-----------------"+i);
	}
	
	@Test
	public void test2(){
		Map<String,Object> params = new HashMap<String,Object>() ;
		params.put("status", 0) ;
		List<Integer> goodsIdList = new ArrayList<Integer>() ;
		goodsIdList.add(1) ;
		params.put("goodsIdList", goodsIdList ) ;
		List<GoodsImgBean> list = goodsImgDAO.getGoodsImgList(params) ;
		System.out.println(list.size());
	}
	
	
}
