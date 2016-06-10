package com.vikas.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePgObj {
	WebDriver webDriver;

	public HomePgObj(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	public By dropMenu=By.xpath(".//*[@id='header-account-menu']/span");
	public By reg=By.xpath(".//*[@id='header-account-register']");
}
