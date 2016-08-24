package com.tanushreechaubal.AndroidAppiumTestProject.Utilities;

import com.tanushreechaubal.AndroidAppiumTestProject.App.App;
import com.tanushreechaubal.AndroidAppiumTestProject.Data.Credentials;

public class LoginUtils {

	public static void loginWithValidCredentials(App app){
		app.loginScreen().waitUntilLoaded();
		app.loginScreen().logIn(Credentials.USER_VALID.username, Credentials.USER_VALID.password);
	}
}
