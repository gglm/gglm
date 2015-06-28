package com.wjtcy.gglm.manager.server.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wjtcy.gglm.manager.bean.AdAdminBean;
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
	public AdAdminRegDomain regAdAdmin(RegAdAdminForm form, String rootPath) {
		AdAdminRegDomain domain = new AdAdminRegDomain(adAdminDAO,form);
		int errorCode = domain.regAdAdmin();
		if (errorCode == 0) {// 注册成功
			// 1.生成二维码
			Encrypt enc;
			try {
				enc = new Encrypt();
//				UUID uuid = UUID.randomUUID();
				String imagePath = rootPath + File.separator +"source"+File.separator+"img"
						+ File.separator + "qr" + File.separator + "ad" ;
				File file = new File(imagePath) ;
				if( !file.exists() ){
					file.mkdirs() ;
				}
				String photoName =  System.currentTimeMillis() + ".jpg";
				File photoFile = new File(imagePath+File.separator+photoName) ;
//				if( !photoFile.exists() ){
////					photoFile.createNewFile() ;
//				}
				String ad_id = enc.encrypt(domain.getAdAdminBean().getId() + "");
				String qrUrl = "ad/admin/qr.do?ad_id=" + ad_id;
				qrcodeComponent.generateQrcode(qrUrl, imagePath+File.separator+photoName);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 2.生成地理信息
			// TODO
		}
		return domain;
	}

	@Override
	public List<AdAdminBean> getNuapprAdAdmin(){
		List<AdAdminBean> result = new ArrayList<AdAdminBean>() ;
		Map<String,Object> params = new HashMap<String,Object>() ;
		params.put("status", 0) ;
		params.put("isConfirm", 0) ;
		result = adAdminDAO.getUnapprAdAdmin(params) ;
		return result ;
	}

	@Override
	public int updateAdAdminConfirm(int id) {
		int row = adAdminDAO.updateAdAdminConfirm(id) ;
		if( row != 1 ){
			return 1 ;
		}
		return 0;
	}
}
