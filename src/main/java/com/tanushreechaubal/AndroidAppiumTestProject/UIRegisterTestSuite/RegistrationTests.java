package com.tanushreechaubal.AndroidAppiumTestProject.UIRegisterTestSuite;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.tanushreechaubal.AndroidAppiumTestProject.DriverUtils.DriverUtils;
import com.tanushreechaubal.AndroidAppiumTestProject.Utilities.RegistrationUtils;

public class RegistrationTests extends DriverUtils{	
		
	/*
	 * Positive Tests for Registration functionality
	*/
	@Test
	public void registrationSuccessful() throws IOException{
		RegistrationUtils.registerUser(app);
		app.registerationScreen().waitUntilLoaded();
		app.registerationScreen().register("Tanu123", "987654321", "24");
		assertTrue(app.loginScreen().isActive());
	}	
	
	/*
	 * Negative Tests for Registration functionality
	*/ 
	@Test
	public void registrationFailure() throws IOException{
		RegistrationUtils.registerUser(app);
		app.registerationScreen().waitUntilLoaded();
		app.registerationScreen().register("invalid", "invalid", "invalid");
		assertTrue(app.registerationScreen().isActive());
	}
	
	@Test
	public void registrationFailureOnEmptyFields() throws IOException{
		RegistrationUtils.registerUser(app);
		app.registerationScreen().waitUntilLoaded();
		app.registerationScreen().register("", "", "");
		assertTrue(app.registerationScreen().isActive());
	}
	
}
