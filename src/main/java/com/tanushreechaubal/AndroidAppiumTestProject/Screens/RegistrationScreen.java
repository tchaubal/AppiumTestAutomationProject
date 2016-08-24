package com.tanushreechaubal.AndroidAppiumTestProject.Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegistrationScreen {

private AppiumDriver driver;
	
	@AndroidFindBy(id = "com.example.tanushreechaubal.loginapp:id/Name_editText")
	private MobileElement nameField;
	
	@AndroidFindBy(id = "com.example.tanushreechaubal.loginapp:id/Password_editText")
	private MobileElement passwordField;
	
	@AndroidFindBy(id = "com.example.tanushreechaubal.loginapp:id/Age_editText")
	private MobileElement ageField;
	
	@AndroidFindBy(id = "com.example.tanushreechaubal.loginapp:id/register_button")
	private MobileElement registerButton;
	
	public RegistrationScreen(AppiumDriver driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS),this);
	}
	
	public void waitUntilLoaded(){
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("com.example.tanushreechaubal.loginapp:id/Age_editText")));	
	}
	
	public void register(String name, String password, String age){
		nameField.sendKeys(name);
		passwordField.sendKeys(password);
		ageField.sendKeys(age);
		registerButton.click();
	}
	
	public boolean isActive(){
		try{
			new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(registerButton));
			return true;
		}catch(TimeoutException e){
			return false;
		}
	}
	
}
