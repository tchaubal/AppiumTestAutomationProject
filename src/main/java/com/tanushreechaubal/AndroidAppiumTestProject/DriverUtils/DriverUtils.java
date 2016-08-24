package com.tanushreechaubal.AndroidAppiumTestProject.DriverUtils;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.tanushreechaubal.AndroidAppiumTestProject.App.App;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverUtils {
	
	protected AppiumDriver driver;
	protected App app;
	
	/*
	 * Setup the android driver and appiumdriver
	 */
	@Before
	public void setUp() throws MalformedURLException{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Nexus18");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		app = new App(driver);
	}
	
	/*
	 * Teardown/shut down the android driver and appiumdriver
	 */
	@After
	public void tearDown(){
		driver.quit();
	}
}
