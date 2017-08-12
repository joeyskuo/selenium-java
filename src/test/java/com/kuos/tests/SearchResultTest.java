package com.kuos.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kuos.pageobjects.HomePage;

public class SearchResultTest {

	WebDriver driver;
	String baseURL;
	HomePage homepage;
	
	final String product = "Echo Show";
	
  @Test
  public void f() {
	  homepage.searchFor(product);
  }


  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  baseURL = "http://www.amazon.com";
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(baseURL);
	  homepage = new HomePage(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
