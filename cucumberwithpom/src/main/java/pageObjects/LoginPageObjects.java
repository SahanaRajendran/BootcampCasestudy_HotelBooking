package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class LoginPageObjects extends BaseClass {
	
	@FindBy(name="userName")
	public WebElement username;
	
	@FindBy(name="userPwd")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//h1[@align='center']")
	public WebElement expectedLoginPageHeading;
	
	@FindBy(xpath="//div[@id='userErrMsg']")
	public WebElement expectedErrorMessageWihoutUsername;
	
	@FindBy(xpath="//div[@id='pwdErrMsg']")
	WebElement expectedErrorMessageWihoutPassword;
	
    public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
    
	public String getLoginPageHeading() {
		return driver.findElement(By.xpath("//h1[@align='center']")).getText();
	}
	
	public String loginWithoutUserName() {
		loginBtn.click();
		return driver.findElement(By.xpath("//div[@id='userErrMsg']")).getText();
	}
	
	public String loginWithoutPassword() {
		username.sendKeys("admin");
		loginBtn.click();
		return driver.findElement(By.xpath("//div[@id='pwdErrMsg']")).getText();
	}
	
	public String getExpectedHeading() {
		return expectedLoginPageHeading.getText();	
	}
	public String getExpectedErrorMessageWihoutUsername() {
		return expectedErrorMessageWihoutUsername.getText();	
	}
	
	public String getExpectedErrorMessageWihoutPassword() {
		return expectedErrorMessageWihoutPassword.getText();
	}
	
	public void login(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	

}
