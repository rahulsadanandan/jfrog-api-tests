package com.jfrog.autotest.api.common;

import org.testng.annotations.BeforeSuite;

import com.jfrog.autotest.api.config.ConfigReader;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;

public class BaseTest {

	
	@BeforeSuite
    public void BeforeSuite() {
    	
		RestAssured.baseURI = ConfigReader.getProperty("test.environment.url");
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName(ConfigReader.getProperty("test.environment.username"));
		authScheme.setPassword(ConfigReader.getProperty("test.environment.password"));
		RestAssured.authentication = authScheme;
    }
	
}
