package com.tanushreechaubal.AndroidAppiumTestProject.Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UserDashboardScreen {

private AppiumDriver driver;
	
	@AndroidFindBy(id = "com.example.tanushreechaubal.loginapp:id/welcomeUsername_textView")
	private MobileElement welcomeMessageUsername;
	
	@AndroidFindBy(id = "com.example.tanushreechaubal.loginapp:id/userAreaCheck_button")
	private MobileElement checkButton;
	
	public UserDashboardScreen(AppiumDriver driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS),this);
	}
	
	public boolean isActive(){
		try{
			new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(welcomeMessageUsername));
			return true;
		}catch(TimeoutException e){
			return false;
		}
	}
	
	public void checkButtonFunction(){
		checkButton.click();
	}
	
}
