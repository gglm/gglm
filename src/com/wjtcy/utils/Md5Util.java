package com.wjtcy.utils;
import java.io.UnsupportedEncodingException;


public class Md5Util {

	public static String md5(String string) {
		if(string==null||string.trim().length()==0){
			return null;
		}
		try {
			return getMD5(string.getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static String getMD5(byte[] source) {
		String s = null;
		char hexDigits[] = { // 用来将字节转换成 16 进制表示的字符
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			md.update(source);
			byte tmp[] = md.digest(); // MD5 的计算结果是一个 128 位的长整数，
			// 用字节表示就是 16 个字节
			char str[] = new char[16 * 2]; // 每个字节用 16 进制表示的话，使用两个字符，
			// 所以表示成 16 进制需要 32 个字符
			int k = 0; // 表示转换结果中对应的字符位置
			for (int i = 0; i < 16; i++) { // 从第一个字节开始，对 MD5 的每一个字节
				// 转换成 16 进制字符的转换
				byte byte0 = tmp[i]; // 取第 i 个字节
				str[k++] = hexDigits[byte0 >>> 4 & 0xf]; // 取字节中高 4 位的数字转换,
				// >>> 为逻辑右移，将符号位一起右移
				str[k++] = hexDigits[byte0 & 0xf]; // 取字节中低 4 位的数字转换
			}
			s = new String(str); // 换后的结果转换为字符串

		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	/**
	 * 检查用户密码
	* @Title: checkPassword 
	* @Description: 
	* @param @param password
	* @param @return    设定文件
	* @author 相磊  
	* @return boolean    返回类型 
	* @throws
	 */
	public static boolean checkPassword(String password,String oldPassword){
		
		//users.setHashpw(MD5DigestUtils.getMD5Str(users.getPassword()+users.getSalt()));
		if(password==null || oldPassword==null){
			return false;
		} 
		String md5password=MD5DigestUtils.getMD5Str(password);  
		return  md5password.equals(oldPassword);
		
	}
	 
	public static void main(String[] args) {
		System.out.println(md5("api_key=1a90a2bf034049f39d5c41d040b0ff54call_id=1253782990268format=XMLid=2method=share.publishsession_key=2.8531c1a354d387b07a4984ae50fabd4c.3600.1253790000-261912373share_date={\"link\":\"http://mininurse.renren.com\",\"pic\":\"\",\"title\":\"小护士\",\"sumary\":\"\",\"comment\":\"gool\"}type=6uid=261912373v=1.094601c5cddab4da0b7bf81f68d50c2d7"));
		System.out.println("33c46203bafcc136c0fd89db4aebef7d".substring(3, 23));
		System.out.println(md5(md5("1"+"1"+"cubs361")+"sales.cubs").substring(3, 23));
	}
}
