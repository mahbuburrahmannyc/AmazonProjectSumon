package com.amazonpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPageFactory {
	private String url="http://www.amazon.com/";
	private String uname= "asiful_haque4@yahoo.com";
	private String upass= "Irin0680";
	
	@FindBy(xpath="//*[@id='nav-link-accountList']")
	private WebElement ClickSignin;
	
	@FindBy(xpath="//*[@id='ap_email']")
	private WebElement Unamebox;
	
	@FindBy(xpath="//*[@id='ap_password']")
	private WebElement Upassbox;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement ClickSingIn;
	
	
	 
	
	
	
	
	

	public WebElement getClickSingIn() {
		return ClickSingIn;
	}





	public WebElement getUpassbox() {
		return Upassbox;
	}





	public WebElement getUnamebox() {
		return Unamebox;
	}





	public WebElement getClickSignin() {
		return ClickSignin;
	}





	public String getUpass() {
		return upass;
	}





	public String getUname() {
		return uname;
	}





	public String getUrl() {
		return url;
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

	













	

}
