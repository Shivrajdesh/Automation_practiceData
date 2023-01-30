package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PomPages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_2 extends BaseClass{

	@Test
	public void Test2() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_sendkeys(login.getTxt_email1(),"shivrajd1254","Email Id");
		Library.custom_click(login.getbtnLogin(),"Login Button");
		Library.custom_sendkeys1(login.getTxt_pass(),"124454648", "Password");
	
		
	}
}
