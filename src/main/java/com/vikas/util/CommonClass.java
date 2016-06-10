package com.vikas.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonClass {
WebDriver webDriver;
WebElement webElement;
public CommonClass(WebDriver webDriver){
	this.webDriver=webDriver;
}
public void Click(By element){
	webElement=webDriver.findElement(element);
	webElement.click();
	
}
public void Select(String msg,By element){
	webElement=webDriver.findElement(element);
	webElement.sendKeys(msg);
}

}
