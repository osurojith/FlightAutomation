package com.vikas.util;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vikas.PageObjects.HomePgObj;
import com.vikas.PageObjects.RegPgObj;

public class BaseClass {
	public static WebDriver webdriver;
	public static CommonClass commonClass;
	public static HomePgObj homeOgObj; 
	public static RegPgObj regPgObj;
	@BeforeClass
	public static void setDriver(){
		webdriver=new FirefoxDriver();
		webdriver.get("https://www.expedia.co.in/p/Flights");
		homeOgObj=new HomePgObj(webdriver);
		commonClass=new CommonClass(webdriver);
		regPgObj=new RegPgObj(webdriver);
	}
}

