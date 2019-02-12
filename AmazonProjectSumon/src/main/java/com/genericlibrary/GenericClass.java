package com.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazonpagefactory.AmazonPageFactory;

public class GenericClass {
	WebDriver Driver;
	 AmazonPageFactory pf;
	 
	 public void getSetup() {
		 System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Desktop/chromedriver");
		 Driver=new ChromeDriver();
		 pf=PageFactory.initElements(Driver,  AmazonPageFactory.class );
		 Driver.get(pf.getUrl());
		 Driver.manage().window().maximize();
	 }
		 
		 public void singIn() {
			 pf.getClickSignin().click();
			 pf.getUnamebox().sendKeys(pf.getUname());
			 pf.getUpassbox().sendKeys(pf.getUpass());
			 pf.getClickSingIn().click();
			 
			 
			 
		 
		 
	 }

}
