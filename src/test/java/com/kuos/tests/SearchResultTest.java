package com.kuos.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kuos.base.BaseTest;
import com.kuos.pageobjects.HomePage;

public class SearchResultTest extends BaseTest {

	HomePage homepage;
	final String product = "Echo Show";
	
  @Test
  public void searchForProduct() {
	  homepage.searchFor(product);
	  Assert.assertTrue(homepage.verifySearchResult(product));
  }

  @BeforeClass
  public void beforeTest() {
	  homepage = new HomePage(driver);
	  homepage.goToHomePage();
  }

  @AfterClass
  public void afterTest() {
	  closeBrowser();
  }

}
