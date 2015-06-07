package com.wjtcy.utils;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

public class HttpUtils {
	/** 请求服务器返回的Http状态码 */
	private int iGetResultCode;
	/** 请求服务器返回的Http回应内容 */
	private String strGetResponseBody;
	/** 执行方法后返回的错误提示 */
	private String errorInfo;
	/** HttpClient对象 */	
	private HttpClient httpclient;
	
	public HttpUtils() {
		httpclient = new HttpClient();
		httpclient.getHttpConnectionManager().getParams().setConnectionTimeout(60000);
		httpclient.getHttpConnectionManager().getParams().setSoTimeout(60000);
	}
	
	/**
	 * 根据给定的URL地址和参数字符串，以Get方法调用，如果成功返回true，如果失败返回false
	 * @param url String url地址，不含参数
	 * @param param String 参数字符串，例如：a=1&b=2&c=3
	 * @return boolean true－成功，false失败，如果返回成功可以getStrGetResponseBody()
	 * 获取返回内容字符串，如果失败，则可访问getErrorInfo()获取错误提示。
	 */
	public boolean executeGetMethod(String url, String param) {
		if (url == null || url.length() <= 0) {
			errorInfo = "无效url地址";
			return false;
		}
		StringBuffer serverURL = new StringBuffer(url);
		if (param != null && param.length() > 0) {
			serverURL.append("?");
			serverURL.append(param);
		}
		//System.out.println("serverURL=" + serverURL);
		GetMethod httpget = new GetMethod(serverURL.toString());
		httpget.setFollowRedirects(true);
		try {
			
			iGetResultCode = httpclient.executeMethod(httpget);
			strGetResponseBody = httpget.getResponseBodyAsString();
			if (iGetResultCode >= 200 && iGetResultCode < 303) {
				return true;
			} else if (iGetResultCode >= 400 && iGetResultCode < 500) {
				errorInfo = "请求的目标地址不存在：" + iGetResultCode;
			} else {
				errorInfo = "请求错误：" + iGetResultCode;
			}
		} catch (Exception ex) {
			errorInfo = ex.getMessage();
			ex.printStackTrace();
		} finally {
			httpget.releaseConnection();
		}
		return false;
	}
	
	/**
	 * 根据给定的URL地址和PostXML字符串，以Post方法调用，如果成功返回true，如果失败返回false
	 * @param url String url地址
	 * @param postBody String 提交的内容字符串
	 * @param contentType String 提交内容的Content-type
	 * @return boolean true－成功，false失败，如果返回成功可以getStrGetResponseBody()
	 * 获取返回内容字符串，如果失败，则可访问getErrorInfo()获取错误提示。
	 */
	public boolean executePostMethod(String strURL, String postBody, String contentType) {
		if (strURL == null || strURL.length() <= 0) {
			errorInfo = "无效url地址";
			return false;
		}
		PostMethod post = new PostMethod(strURL);
		try {
			post.setRequestHeader("Content-type", contentType);
			post.setRequestEntity(new StringRequestEntity(postBody, contentType, null));
			
			iGetResultCode = httpclient.executeMethod(post);
			strGetResponseBody = post.getResponseBodyAsString();
			if (iGetResultCode >= 200 && iGetResultCode < 303) {
				return true;
			} else if (iGetResultCode >= 400 && iGetResultCode < 500) {
				errorInfo = "请求的目标地址不存在：" + iGetResultCode;
			} else {
				errorInfo = "请求错误：" + iGetResultCode;
			}
		} catch (Exception ex) {
			errorInfo = ex.getMessage();
			ex.printStackTrace();
		} finally {
			post.releaseConnection();
		}
		return false;
	}

	public int getiGetResultCode() {
		return iGetResultCode;
	}

	public String getStrGetResponseBody() {
		return strGetResponseBody;
	}

	public String getErrorInfo() {
		return errorInfo;
	}
}
