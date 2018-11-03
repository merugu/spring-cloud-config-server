package com.innovativeintelli.appurlservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("appurl-service")
public class Configuration {
	
	private String facebookurl;
	private String googleurl;
	
	public String getFacebookurl() {
		return facebookurl;
	}
	public void setFacebookurl(String facebookurl) {
		this.facebookurl = facebookurl;
	}
	public String getGoogleurl() {
		return googleurl;
	}
	public void setGoogleurl(String googleurl) {
		this.googleurl = googleurl;
	}
	
	

}
