package com.wjtcy.gglm.manager.server.impl;

import java.io.File;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wjtcy.gglm.manager.component.QrcodeComponent;
import com.wjtcy.gglm.manager.dao.AdAdminDAO;
import com.wjtcy.gglm.manager.domain.AdAdminRegDomain;
import com.wjtcy.gglm.manager.encrypt.Encrypt;
import com.wjtcy.gglm.manager.form.RegAdAdminForm;
import com.wjtcy.gglm.manager.server.AdAdminService;

@Service
public class AdAdminServiceImpl implements AdAdminService {

	@Resource
	private AdAdminDAO adAdminDAO;

	@Resource
	private QrcodeComponent qrcodeComponent;

	@Override
	public int regAdAdmin(RegAdAdminForm form, String rootPath) {
		AdAdminRegDomain domain = new AdAdminRegDomain(adAdminDAO);
		int errorCode = domain.regAdAdmin(form);
		if (errorCode == 0) {// 注册成功
			// 1.生成二维码
			Encrypt enc = new Encrypt();
			UUID uuid = UUID.randomUUID();
			String imagePath = rootPath + File.separator + "img"
					+ File.separator + "qr" + File.separator + "ad"
					+ File.separator + uuid + ".jpg";
			String ad_id = enc.encode(domain.getAdAdminBean().getId() + "");
			String qrUrl = "ad/admin/qr.do?ad_id=" + ad_id;
			qrcodeComponent.generateQrcode(qrUrl, imagePath);
			// 2.生成地理信息
			// TODO
		}
		return errorCode;
	}

}
