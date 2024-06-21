package com.inetbankingv1.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL = "https://demo.guru99.com/V1/index.php";
	public String username = "mngr577350";
	public String password = "aqerysY";
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
