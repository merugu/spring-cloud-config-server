package com.innovativeintelli.appurlservice.domain;

public class URLDictionary {
	
	private int URLId;
	private String URL;
	private String description;
	
	public URLDictionary(int uRLId, String uRL, String description) {
		super();
		URLId = uRLId;
		URL = uRL;
		this.description = description;
	}

	public int getURLId() {
		return URLId;
	}

	public void setURLId(int uRLId) {
		URLId = uRLId;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "URLId is "+URLId+ ", URL is " + URL + ", description is " +description;
	}

}
