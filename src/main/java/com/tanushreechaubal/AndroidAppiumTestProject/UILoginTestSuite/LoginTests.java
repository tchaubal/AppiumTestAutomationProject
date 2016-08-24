package com.tanushreechaubal.AndroidAppiumTestProject.UILoginTestSuite;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jetty.util.security.Credential;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.tanushreechaubal.AndroidAppiumTestProject.App.App;
import com.tanushreechaubal.AndroidAppiumTestProject.Data.Credentials;
import com.tanushreechaubal.AndroidAppiumTestProject.DriverUtils.DriverUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LoginTests extends DriverUtils{	
		
	/*
	 * Positive tests on login functionality
	*/ 
	@Test
	public void loginWithValidCredentials(){
		app.loginScreen().waitUntilLoaded();
		app.loginScreen().logIn(Credentials.USER_VALID.username, Credentials.USER_VALID.password);
		assertTrue(app.userDashboardScreen().isActive());
	}
	
	/*
	 * Negative tests on login functionality
	*/ 
	@Test
	public void loginWithInvalidCredentials(){
		app.loginScreen().waitUntilLoaded();
		app.loginScreen().logIn(Credentials.USER_INVALID.username, Credentials.USER_INVALID.password);
		assertTrue(app.loginScreen().isActive());
	}
	
	@Test
	public void loginWithEmptyCredentials(){
		app.loginScreen().waitUntilLoaded();
		app.loginScreen().logIn(Credentials.INVALID_DETAILS.username, Credentials.INVALID_DETAILS.password);
		assertTrue(app.loginScreen().isActive());
	}
	
}
