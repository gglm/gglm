package com.wjtcy.gglm.test.dao;

import org.junit.Test;

import com.wjtcy.gglm.manager.component.QrcodeComponent;
import com.wjtcy.gglm.manager.server.impl.QrcodeServiceImpl;
import com.wjtcy.gglm.manager.server.impl.WeixinServiceImpl;

public class ServiceTest {

	@Test
	public void test1(){
		WeixinServiceImpl service = new WeixinServiceImpl() ;
		service.weixinAdminSyn(); 
	}
	
	/**
	 * 测试二维码生成
	 */
	@Test
	public void test2(){
		WeixinServiceImpl service = new WeixinServiceImpl() ;

		QrcodeServiceImpl s = new QrcodeServiceImpl() ;
		s.setWeixinServiceImpl(service); 
		s.getQrcode(1, 1l, "11111");
	}
	
	
	@Test
	public void test3(){
		QrcodeComponent qr = new QrcodeComponent() ;
		qr.generateQrcode("http://www.linshituan.com/advertiser/", "/Users/lyg/tmp/123123123.jpg") ;
		System.out.println();
	}
}
