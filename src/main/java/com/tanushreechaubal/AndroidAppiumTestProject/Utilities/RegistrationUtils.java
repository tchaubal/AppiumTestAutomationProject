package com.tanushreechaubal.AndroidAppiumTestProject.Utilities;

import com.tanushreechaubal.AndroidAppiumTestProject.App.App;

public class RegistrationUtils {

	public static void registerUser(App app){
		app.loginScreen().waitUntilLoaded();
		app.loginScreen().register();
	}
}
