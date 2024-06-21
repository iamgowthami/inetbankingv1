package com.inetbankingv1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//creating constructor for webdriver
	WebDriver ldriver;
	
	LoginPage(WebDriver rdriver){
		
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//finding elements
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpwd;
	
	
	@FindBy(name="btnlogin")
	@CacheLookup
	WebElement btnlogin;

	
	//for above elements  action methods
	public void setUserName(String uname) {
		txtusername.sendKeys(uname);
	}
	public void setUserPassword(String upwd) {
		txtpwd.sendKeys(upwd);
	}

	public void LoginButoon(String btn) {
		btnlogin.sendKeys(btn);
	}


	
    

}
