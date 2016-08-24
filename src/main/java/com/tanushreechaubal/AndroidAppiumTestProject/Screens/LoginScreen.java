package com.tanushreechaubal.AndroidAppiumTestProject.Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tanushreechaubal.AndroidAppiumTestProject.Data.Credentials;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen {

	private AppiumDriver driver;
	
	@AndroidFindBy(id = "com.example.tanushreechaubal.loginapp:id/userName_editText")
	private MobileElement userNameField;
	
	@AndroidFindBy(id = "com.example.tanushreechaubal.loginapp:id/Password_editText")
	private MobileElement passwordField;
	
	@AndroidFindBy(id = "com.example.tanushreechaubal.loginapp:id/login_button")
	private MobileElement loginButton;
	
	@AndroidFindBy(id = "com.example.tanushreechaubal.loginapp:id/registerHere_textView")
	private MobileElement registerLink;
	
	public LoginScreen(AppiumDriver driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS),this);
	}
	
	public void waitUntilLoaded(){
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("com.example.tanushreechaubal.loginapp:id/userName_editText")));	
	}
	
	public void logIn(String uname,String pass){
		userNameField.sendKeys(uname);
		passwordField.sendKeys(pass);
		loginButton.click();
	}
	
	public boolean isActive(){
		try{
			new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(userNameField));
			return true;
		}catch(TimeoutException e){
			return false;
		}
	}
	
	public void register(){
		registerLink.click();
	}
	
}
