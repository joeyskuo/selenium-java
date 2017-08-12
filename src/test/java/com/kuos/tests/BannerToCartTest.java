package com.kuos.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kuos.base.BaseTest;
import com.kuos.pageobjects.HomePage;
import com.kuos.pageobjects.ProductPage;

public class BannerToCartTest extends BaseTest{
	
  HomePage homepage;
  ProductPage productpage;
  
  @Test
  public void addBannerItemToCart() {
		homepage.clickInlineBanner();
		productpage.clickAddToCartButton();
		Assert.assertTrue(productpage.verifyAddedToCart());
  }

  @BeforeClass
  public void beforeClass() {
	  homepage = new HomePage(driver);
	  productpage = new ProductPage(driver);
	  homepage.goToHomePage();
  }

  @AfterClass
  public void afterClass() {
	  closeBrowser();
  }

}
