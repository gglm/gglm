package com.wjtcy.gglm.manager.server;

/**
 * 
 * 生成二维码信息
 * @date  2015年6月6日 下午2:17:34
 *
 */
public interface QrcodeService {
 
	/**
	 * 获取二维码
	 * @param type
	 *    1.获取临时的二维码，2 获取永久的二维码
	 * @param sceneId
	 * @param sceneStr
	 */
	public void getQrcode(int type,long sceneId,String sceneStr);
	

}
