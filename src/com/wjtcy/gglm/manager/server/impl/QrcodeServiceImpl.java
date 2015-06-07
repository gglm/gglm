package com.wjtcy.gglm.manager.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.wjtcy.gglm.manager.server.CommonService;
import com.wjtcy.gglm.manager.server.QrcodeService;
import com.wjtcy.third.weixin.constants.WeixinConstants;
import com.wjtcy.utils.HttpUtils;

public class QrcodeServiceImpl implements QrcodeService {

	/**
	 * 获取token的服务
	 */
	@Autowired
	private CommonService commonService;

	@Override
	public void getQrcode(int type, String sceneId, String sceneStr) {
		String qrcodeType = getQrcode(type);
		if (StringUtils.isEmpty(qrcodeType)) {
			return;
		}
		String token = commonService.weixinAdminSyn().getAccessToken();
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
		httpUtils.executeGetMethod(WeixinConstants.getTicketURl + ticket, null);
	}

}
