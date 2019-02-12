package com.tt.nyc.amazon;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static void main(String[]args)  {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Desktop/chromedriver");
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("http://www.amazon.com/");
		Driver.manage().window().maximize();
		Driver.getCurrentUrl();
		System.out.println(Driver.getCurrentUrl());
		Driver.getTitle();
		System.out.println(Driver.getTitle());
		
		
		Driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
		Driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("asiful_haque4@yahoo.com");
		Driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Irin0680");
		Driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	
	
		
	
	
		
	
		
		
			
			
		}
		
		
	}


