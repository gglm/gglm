package com.wjtcy.gglm.manager.encrypt;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Encrypt {
	private Key key;
	private byte[] byteMi = null;
	private byte[] byteMing = null;
	private String strMi= "";
	private String strM= ""; 
	private String keyStr = "faslewrod";
	
	public Encrypt(){
		try{  
			KeyGenerator _generator = KeyGenerator.getInstance("DES");  
			_generator.init(new SecureRandom(keyStr.getBytes()));  
			this.key = _generator.generateKey();  
			_generator=null;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Encrypt(String keyStr){
		try{  
			KeyGenerator _generator = KeyGenerator.getInstance("DES");  
			_generator.init(new SecureRandom(keyStr.getBytes()));  
			this.key = _generator.generateKey();  
			_generator=null;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//  加密String明文输入,String密文输出  
	public String encode(String strMing){
		BASE64Encoder base64en = new BASE64Encoder();  
		try {
			this.byteMing = strMing.getBytes("UTF8");  
			this.byteMi = this.getEncCode(this.byteMing);  
			this.strMi = base64en.encode(this.byteMi);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			this.byteMing = null;  
			this.byteMi = null;
		}
		return this.strMi;
	}  
	//加密以byte[]明文输入,byte[]密文输出    
	private byte[] getEncCode(byte[] byteS){
		byte[] byteFina = null;  
		Cipher cipher;  
		try{
			cipher = Cipher.getInstance("DES");  
			cipher.init(Cipher.ENCRYPT_MODE,key);  
			byteFina = cipher.doFinal(byteS);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			cipher = null;
		}
		       
		return byteFina;
	} 
	// 解密:以String密文输入,String明文输出   
	public String decode(String strMi){  
		BASE64Decoder base64De = new BASE64Decoder();   
		try{
			this.byteMi = base64De.decodeBuffer(strMi);  
			this.byteMing = this.getDesCode(byteMi);  
			this.strM = new String(byteMing,"UTF8");  
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			base64De = null;  
			byteMing = null;  
			byteMi = null;
		}  
	  return this.strM;
	}
	// 解密以byte[]密文输入,以byte[]明文输出    
	private byte[] getDesCode(byte[] byteD){
		Cipher cipher;  
		byte[] byteFina=null;  
		try{
			cipher = Cipher.getInstance("DES");  
			cipher.init(Cipher.DECRYPT_MODE,key);  
			byteFina = cipher.doFinal(byteD);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			cipher=null;
		}  
		return byteFina;
	} 
}
