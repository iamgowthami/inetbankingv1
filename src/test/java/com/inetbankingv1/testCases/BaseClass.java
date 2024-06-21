package com.inetbankingv1.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL = "https://www.way2automation.com/angularjs-protractor/banking/#/login";
	public String username = "mngr577350";
	public String username1 = "mngr577350";
	public String username2 = "mngr577350";


	public String password = "aqerysY";
	public String password2 = "aqerysY";

	public static WebDriver driver;

	public Logger logger;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + " Drivers//chromedriver.exe");
		driver = new ChromeDriver();

		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");

	}

	public void teardown() {
		driver.quit();
	}

}
