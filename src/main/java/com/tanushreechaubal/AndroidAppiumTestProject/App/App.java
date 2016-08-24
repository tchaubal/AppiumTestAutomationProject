package com.tanushreechaubal.AndroidAppiumTestProject.App;

import com.tanushreechaubal.AndroidAppiumTestProject.Screens.LoginScreen;
import com.tanushreechaubal.AndroidAppiumTestProject.Screens.RegistrationScreen;
import com.tanushreechaubal.AndroidAppiumTestProject.Screens.UserDashboardScreen;
import com.tanushreechaubal.AndroidAppiumTestProject.Utilities.RegistrationUtils;

import io.appium.java_client.AppiumDriver;

public class App {

	private AppiumDriver driver;
	
	public App(AppiumDriver driver){
		this.driver = driver;
	}
	
	public LoginScreen loginScreen(){
		return new LoginScreen(driver);
	}
	
	public RegistrationScreen registerationScreen(){
		return new RegistrationScreen(driver);
	}
	
	public UserDashboardScreen userDashboardScreen(){
		return new UserDashboardScreen(driver);
	}
}
