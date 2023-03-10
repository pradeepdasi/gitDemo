package com.PageObjects;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abstarctComponents.abstarctComponent;

public class ConformationPage extends abstarctComponent {
WebDriver driver;

public ConformationPage(WebDriver driver) {
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}

@FindBy(css="h1.hero-primary")
WebElement confirmationmessage;
public String getconfirmationMessage() {
	return confirmationmessage.getText();
	
	
}

}
