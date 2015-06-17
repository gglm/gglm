package com.wjtcy.gglm.manager.server.impl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URLEncoder;

import javax.annotation.Resource;
import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.wjtcy.gglm.manager.server.CommonService;
import com.wjtcy.gglm.manager.server.QrcodeService;
import com.wjtcy.third.weixin.constants.WeixinConstants;
import com.wjtcy.utils.HttpUtils;

@Service
public class QrcodeServiceImpl implements QrcodeService {

	/**
	 * 获取token的服务
	 */
	@Resource
	private CommonService weixinServiceImpl;
	
	public CommonService getWeixinServiceImpl() {
		return weixinServiceImpl;
	}

	public void setWeixinServiceImpl(CommonService weixinServiceImpl) {
		this.weixinServiceImpl = weixinServiceImpl;
	}

	@Override
	public void getQrcode(int type, long sceneId, String sceneStr) {
		String qrcodeType = getQrcode(type);
		if (StringUtils.isEmpty(qrcodeType)) {
			return;
		}
		String token = weixinServiceImpl.weixinAdminSyn().getAccessToken();
		HttpUtils httpUtils = new HttpUtils();
		JSONObject resJson = new JSONObject();
		resJson.put("action_name", qrcodeType);
		if (type == 1) {
			resJson.put("expire_seconds", 604800);
		}
		JSONObject scene = new JSONObject();
		scene.put("scene_id", sceneId);
		JSONObject actionInfo = new JSONObject();
		actionInfo.put("scene", scene);
		resJson.put("action_info", actionInfo);
		httpUtils.executePostMethod(WeixinConstants.getQrcodeUrl + token,
				resJson.toJSONString(), "json");
		JSONObject reqJson = JSONObject.parseObject(httpUtils
				.getStrGetResponseBody());
		if (reqJson.containsKey("errcode")) {
			// 失败了
			return;
		}
		getTicket(reqJson.getString("ticket"));
	}

	private String getQrcode(int type) {
		switch (type) {
		case 1:
			return "QR_SCENE";
		case 2:
			return "QR_LIMIT_SCENE";
		default:
			return null;

		}
	}

	public void getTicket(String ticket) {
		HttpUtils httpUtils = new HttpUtils();
		try{
			httpUtils.executeImageDownloadMethod(WeixinConstants.getTicketURl + URLEncoder.encode(ticket,"utf-8"), null);
			BufferedImage image = httpUtils.getImage() ;
			File f = new File("image.jpg");
			ImageIO.write(image, "jpg", f);
			System.out.println(image);
		}catch(Exception e){
			e.printStackTrace() ;
		}
	}

}
