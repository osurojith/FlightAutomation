package com.vikas.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vikas.util.BaseClass;

public class Home extends BaseClass{
	@Test
	public void HomeTest() throws Exception{
		commonClass.Click(homeOgObj.dropMenu);
		Thread.sleep(2000);
		commonClass.Click(homeOgObj.reg);
	}

}
