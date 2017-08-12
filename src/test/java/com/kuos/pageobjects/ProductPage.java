package com.kuos.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver driver;
	
	public ProductPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	private final static String ADD_TO_CART_BUTTON_ID = "add-to-cart-button";

    
    
	@FindBy(id=ADD_TO_CART_BUTTON_ID)
	WebElement addToCartButton;	
	
	public void clickAddToCartButton(){
		addToCartButton.click();
	}
}
