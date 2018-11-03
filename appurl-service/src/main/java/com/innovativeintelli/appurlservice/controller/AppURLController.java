package com.innovativeintelli.appurlservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovativeintelli.appurlservice.config.Configuration;
import com.innovativeintelli.appurlservice.domain.URLDictionary;

@RestController
@RequestMapping("/api/appurl")
public class AppURLController {
	
	@Autowired
	Configuration configuration;
	
	public AppURLController() {
			}
	
	@GetMapping("/geturls")
	public List<URLDictionary> getURLs() {
	    List<URLDictionary> urlDictionaries = new ArrayList<>();
		urlDictionaries.add(new URLDictionary(1, configuration.getFacebookurl(), "Social Networking Website"));
		urlDictionaries.add(new URLDictionary(2, configuration.getGoogleurl(), "Public Search Engine"));
		return urlDictionaries;
	}

}
