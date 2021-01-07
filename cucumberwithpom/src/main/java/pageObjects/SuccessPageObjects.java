package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class SuccessPageObjects extends BaseClass{
	
	@FindBy(xpath="//h1")
	public WebElement successPageHeading;
	
	public SuccessPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public String getSuccessPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getSuccessPageHeading() {
		return successPageHeading.getText();
	}

}
