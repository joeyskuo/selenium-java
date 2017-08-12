package com.kuos.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver driver;
	WebElement element;
	
	public BasePage(WebDriver driver){
		this.driver=driver;
	}
	
	public Boolean isElementPresent(String locator, String locatorType){
		
		try {	
			if (locatorType == "id") {
				element = driver.findElement(By.id(locator));	
			} else if (locatorType == "xpath") {
				element = driver.findElement(By.xpath(locator));
			}
		} catch(Exception e) {
			return false;
		}
		
		return true;
	}
}
