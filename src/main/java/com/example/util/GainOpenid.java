package com.example.util;

import com.google.gson.Gson;

public class GainOpenid {
	
	private static final String appid=""; 
	private static final String secret="";
      

	public static String getopen(String code) {
		if(code.length()>0) {
			String a=code.substring(code.indexOf("=")+1, code.indexOf("&"));
			String openid=getopenId(a);
			return openid;
		}else {
			return null;
		}
	}
	
	public static String getopenId(String code) {
		WxGetCodeAck dto = new WxGetCodeAck();    
		String grant_type="authorization_code";
		String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid="+appid+"&secret="+secret+"&code="+code+"&grant_type="+grant_type+""; 
		String ret = HttpPostUtil.doHttpPostJson(url, "");  
		Gson gson = new Gson();   
		dto = gson.fromJson(ret,WxGetCodeAck.class);     
		return dto.getOpenid(); 
	}
 
    
}
