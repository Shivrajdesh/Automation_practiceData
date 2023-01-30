package com.PomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

	@FindBy(how=How.XPATH,using="//input[@name='email']")private WebElement Txt_email;
	@FindBy(how=How.XPATH,using="//input[@name='pass']")private WebElement Txt_pass;
	@FindBy(how=How.XPATH,using="//button[@name='login']")private WebElement btnLogin;
	
	
	public WebElement getTxt_email1() {
		return Txt_email;
	}
	public WebElement getTxt_pass() {
		return Txt_pass;
	}
	public WebElement getbtnLogin() {
		return btnLogin;
	}
	
}
