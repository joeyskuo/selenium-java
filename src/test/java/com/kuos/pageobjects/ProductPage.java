package com.kuos.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kuos.base.BasePage;

public class ProductPage extends BasePage{
	
	WebDriver driver;
	
	public ProductPage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	private final static String ADD_TO_CART_BUTTON_ID = "add-to-cart-button";
	private final static String ADDED_TO_CART_CONFIRMED_ID = "confirm-text";
    
    
	@FindBy(id=ADD_TO_CART_BUTTON_ID)
	WebElement addToCartButton;	
	
	public void clickAddToCartButton(){
		addToCartButton.click();
	}
	
	public Boolean verifyAddedToCart(){
		return isElementPresent(ADDED_TO_CART_CONFIRMED_ID, "id");
	}	
}
