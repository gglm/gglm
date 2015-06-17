package com.wjtcy.gglm.manager.component;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URLEncoder;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;

import com.wjtcy.third.liantu.constants.LiantuConstants;
import com.wjtcy.utils.HttpUtils;

@Component
public class QrcodeComponent {

	private final String rootUrl = "http://www.linshituan.com/" ;
	
	public boolean generateQrcode(final String uri,final String outputUri){
		HttpUtils httpUtils = new HttpUtils();
		try{
			String url = rootUrl + uri ;
			httpUtils.executeImageDownloadMethod(LiantuConstants.qrcode_generate_url + URLEncoder.encode(url,"utf-8"), null);
			BufferedImage image = httpUtils.getImage() ;
			File f = new File(outputUri);
			ImageIO.write(image, "jpg", f);
			System.out.println(image);
			return true ;
		}catch(Exception e){
			e.printStackTrace() ;
			return false ;
		}
	}
}
