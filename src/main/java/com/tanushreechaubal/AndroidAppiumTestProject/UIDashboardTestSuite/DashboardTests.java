package com.tanushreechaubal.AndroidAppiumTestProject.UIDashboardTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tanushreechaubal.AndroidAppiumTestProject.DriverUtils.DriverUtils;
import com.tanushreechaubal.AndroidAppiumTestProject.Utilities.LoginUtils;

public class DashboardTests extends DriverUtils{

	@Test
	public void userAreaButtonWorks(){
		LoginUtils.loginWithValidCredentials(app);
		app.userDashboardScreen().checkButtonFunction();
		assertTrue(app.userDashboardScreen().isActive());
	}
}
