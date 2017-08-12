package com.kuos.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    private final static String SEARCHBAR_ID = "twotabsearchtextbox";
    private final static String SEARCH_BUTTON_CSS = ".nav-search-submit.nav-sprite";
    private final static String INLINE_BANNER_ID = "gw-desktop-herotator";

    
	@FindBy(id=SEARCHBAR_ID)
	WebElement searchbar;
	
	@FindBy(css=SEARCH_BUTTON_CSS)
	WebElement searchButton;
	
	@FindBy(id=INLINE_BANNER_ID)
	WebElement inlineBanner;
	
	public void searchFor(String product) {
		searchbar.sendKeys(product);
		searchButton.click();
	}
}
