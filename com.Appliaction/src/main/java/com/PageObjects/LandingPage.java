package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abstarctComponents.abstarctComponent;

public class LandingPage extends abstarctComponent {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[class*='flyInOut']")
	WebElement errormessage;
	@FindBy(id ="userEmail")
	WebElement UsernameEmail;

	@FindBy(id = "userPassword")
	WebElement emailpassword;

	@FindBy(name = "login")
	WebElement submit;

	public productCatalogue loginApplication(String username, String password) {
		UsernameEmail.sendKeys(username);
		emailpassword.sendKeys(password);
		submit.click();
		return new productCatalogue(driver);
	}

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	public String geterrorMessage() {
		waitForWebElementappear(errormessage);
		return errormessage.getText();

	}

}
