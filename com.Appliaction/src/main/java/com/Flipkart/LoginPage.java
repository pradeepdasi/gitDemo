package com.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	// url https://rahulshettyacademy.com/client/auth/login
	// username :kumartest.d@gmail.com
	// password:Pradeep123@

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "userEmail")
	WebElement UsernameEmail;

	@FindBy(id = "userPassword")
	WebElement emailpassword;

	@FindBy(name = "login")
	WebElement submit;

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}

	public void typeEamil(String username, String password) {
		UsernameEmail.sendKeys(username);
		emailpassword.sendKeys(password);
		submit.click();
		
	}

}
