package com.wjtcy.gglm.test.dao;

import org.junit.Test;

import com.wjtcy.gglm.manager.encrypt.Encrypt;
import com.wjtcy.utils.Md5Util;

public class MainTest {

	@Test
	public void test1() throws Exception{
		Encrypt enc = new Encrypt() ;
		String i = enc.encrypt("1") ;
		System.out.println(i);
	}
	
	@Test
	public void test2() throws Exception{
		Encrypt enc = new Encrypt() ;
		String e = enc.encrypt("1") ;
		System.out.println(e);
		String i = enc.decrypt(e) ;
		System.out.println(i);
	}
	
	@Test
	public void test3(){
		String md5 = Md5Util.md5("caoqiangaiyanglei"); 
		System.out.println(md5);
	}
}
