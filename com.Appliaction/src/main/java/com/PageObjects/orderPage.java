package com.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abstarctComponents.abstarctComponent;

public class orderPage extends abstarctComponent{

	
	WebDriver driver;
	public orderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(css="tr td:nth-child(3)")
	private List<WebElement> productNames;
	
	public Boolean verifyOrderDisplay(String productname) {
		Boolean match=productNames.stream().anyMatch(product-> product.getText().equalsIgnoreCase(productname));
		return match;
	}
	
	
}
