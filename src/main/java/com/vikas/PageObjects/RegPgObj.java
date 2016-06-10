package com.vikas.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPgObj {
	WebDriver webDriver;

	public RegPgObj(WebDriver webDriver) {
		this.webDriver = webDriver;

	}
	public By fname=By.xpath(".//*[@id='create-account-firstname']");
	public By lname=By.xpath(".//*[@id='create-account-lastname']");
	public By email=By.xpath(".//*[@id='create-account-emailId']");
	public By password=By.xpath(".//*[@id='create-account-password']");
	public By confirmpassword=By.xpath(".//*[@id='create-account-confirm-password']");
	public By createbtn=By.xpath(".//*[@id='create-account-submit-button']");
}
