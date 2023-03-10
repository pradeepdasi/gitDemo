package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abstarctComponents.abstarctComponent;

public class checkOutPage extends abstarctComponent {

	public static WebDriver driver;

	public checkOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
	WebElement selectCountry;
	@FindBy(css = ".action__submit")
	WebElement submit;

	@FindBy(css = "[placeholder='Select Country']")
	WebElement country;

	By results = By.cssSelector(".ta-results");

	public void selectcountry(String countryname) {
		Actions a = new Actions(driver);

		a.sendKeys(country, countryname).build().perform();
		waitForElementToAppear(results);
		selectCountry.click();

	}

	public static void scrollToBottomPage() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public ConformationPage submitOrder() {
		scrollToBottomPage();
		submit.click();

		return new ConformationPage(driver);
	}

}
