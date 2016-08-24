package com.tanushreechaubal.AndroidAppiumTestProject.Data;


	public enum Credentials {

		USER_VALID("tchaubal","Tanu12345"),
		USER_INVALID("invalid","invalid"),
		INVALID_DETAILS("","");
		
		public String username;
		public String password;
		
		private Credentials(String username, String password){
			this.username = username;
			this.password = password;
			}
	}
	

