package com.kuos.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kuos.base.BasePage;

public class HomePage extends BasePage{
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	private final static String HOMEPAGE_URL = "http://www.amazon.com";
	
	private final static String SEARCHBAR_ID = "twotabsearchtextbox";
    private final static String SEARCH_BUTTON_CSS = ".nav-search-submit.nav-sprite";
    private final static String INLINE_BANNER_ID = "gw-desktop-herotator";
    
    private final static String FIRST_RESULT_BASE_XPATH = "//li[@id='result_0']//a[contains(@title,'%s')]";
    
	@FindBy(id=SEARCHBAR_ID)
	WebElement searchbar;
	
	@FindBy(css=SEARCH_BUTTON_CSS)
	WebElement searchButton;
	
	@FindBy(id=INLINE_BANNER_ID)
	WebElement inlineBanner;
	
	public void goToHomePage(){
		driver.get(HOMEPAGE_URL);
	}
	
	public void searchFor(String product) {
		searchbar.sendKeys(product);
		searchButton.click();
	}
	
	public void clickInlineBanner(){
		inlineBanner.click();
	}
	
	public Boolean verifySearchResult(String product){
		return isElementPresent(String.format(FIRST_RESULT_BASE_XPATH, product), "xpath");
	}
}
