package com.wjtcy.gglm.test.dao;

import org.junit.Test;

import com.wjtcy.gglm.manager.server.impl.WeixinServiceImpl;

public class ServiceTest {

	@Test
	public void test1(){
		WeixinServiceImpl service = new WeixinServiceImpl() ;
		service.weixinAdminSyn(); 
	}
}
