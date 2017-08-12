package com.kuos.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BannerToCartTest {
	WebDriver driver;
	String baseURL;
	
	
  @Test
  public void f() {
		driver.findElement(By.id("gw-desktop-herotator")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
  }


  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  baseURL = "http://www.amazon.com";
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(baseURL);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
