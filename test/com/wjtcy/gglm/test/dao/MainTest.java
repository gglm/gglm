package com.wjtcy.gglm.test.dao;

import org.junit.Test;

import com.wjtcy.gglm.manager.encrypt.Encrypt;

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
}
