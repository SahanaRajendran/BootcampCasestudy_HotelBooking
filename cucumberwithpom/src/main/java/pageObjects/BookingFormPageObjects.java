package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseclass.BaseClass;

public class BookingFormPageObjects extends BaseClass {
	
	@FindBy(id = "txtFirstName")
	public WebElement firstName;

	@FindBy(id = "txtLastName")
	public WebElement lastName;

	@FindBy(id = "txtEmail")
	public WebElement email;

	@FindBy(id = "txtPhone")
	public WebElement mobile;

	@FindBy(xpath = "//textarea")
	public WebElement address;

	@FindBy(xpath = "//table//tbody//tr[6]//td")
	public WebElement addressLabel;

	@FindBy(id = "btnPayment")
	public WebElement confirmBtn;

	@FindBy(name = "city")
	public WebElement cityDropdown;

	@FindBy(name = "state")
	public WebElement stateDropdown;

	@FindBy(name = "persons")
	public WebElement peopleDropdown;

	@FindBy(id = "rooms")
	public WebElement numberOfRooms;

	@FindBy(id = "txtCardholderName")
	public WebElement cardHolderName;

	@FindBy(id = "txtDebit")
	public WebElement debitCard;

	@FindBy(id = "txtCvv")
	public WebElement cvv;

	@FindBy(id = "txtMonth")
	public WebElement expirationMonth;

	@FindBy(id = "txtYear")
	public WebElement expirationYear;

	public BookingFormPageObjects() {
		PageFactory.initElements(driver, this);
	}

	public String getBookingFormTitle() {
		return driver.getTitle();
	}

	public String getBookingFormUrl() {
		return driver.getCurrentUrl();
	}

	public String confirmWithoutFirstName() {
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutLastName() {
		firstName.sendKeys(prop.getProperty("firstName"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutEmail() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithIncorrectEmail() {
		email.sendKeys(prop.getProperty("incorrectEmail"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutMobile() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("correctEmail"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithIncorrectMobile() {
		mobile.sendKeys(prop.getProperty("incorrectMobile"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String enterAddress() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("correctEmail"));
		mobile.sendKeys(prop.getProperty("correctMobile"));
		address.sendKeys(prop.getProperty("address"));
		return address.getAttribute("value");
	}

	public String confirmWithoutCity() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("correctEmail"));
		mobile.sendKeys(prop.getProperty("correctMobile"));
		address.sendKeys(prop.getProperty("address"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutState() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("correctEmail"));
		mobile.sendKeys(prop.getProperty("correctMobile"));
		address.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String selectPeople() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("correctEmail"));
		mobile.sendKeys(prop.getProperty("correctMobile"));
		address.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		return numberOfRooms.getText();
	}

	public String confirmWithoutCardHolder() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("correctEmail"));
		mobile.sendKeys(prop.getProperty("correctMobile"));
		address.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutDebitCard() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("correctEmail"));
		mobile.sendKeys(prop.getProperty("correctMobile"));
		address.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutCVV() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("correctEmail"));
		mobile.sendKeys(prop.getProperty("correctMobile"));
		address.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		debitCard.sendKeys(prop.getProperty("debitCard"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutExpMonth() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("correctEmail"));
		mobile.sendKeys(prop.getProperty("correctMobile"));
		address.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		debitCard.sendKeys(prop.getProperty("debitCard"));
		cvv.sendKeys(prop.getProperty("cvv"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String confirmWithoutExpYear() {
		expirationMonth.sendKeys(prop.getProperty("expirationMonth"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}
	
	public void confirmWithAllDetails() {
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("correctEmail"));
		mobile.sendKeys(prop.getProperty("correctMobile"));
		address.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		debitCard.sendKeys(prop.getProperty("debitCard"));
		cvv.sendKeys(prop.getProperty("cvv"));
		expirationMonth.sendKeys(prop.getProperty("expirationMonth"));
		expirationYear.sendKeys(prop.getProperty("expirationYear"));
		confirmBtn.click();
	}
}



