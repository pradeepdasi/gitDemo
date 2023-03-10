package com.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abstarctComponents.abstarctComponent;

public class cartPage extends abstarctComponent {
	
	public WebDriver driver;
	public cartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".cartSelection h3")
	private List<WebElement>  cartproducts;

	@FindBy(css=".totalRow button")
	WebElement checkout;
	

	

	
	
	public checkOutPage goTocheckout() {
		checkout.click();
		return new checkOutPage(driver);
	}

	public Boolean VerifyProductDisplay(String productname) {
		
		Boolean match=cartproducts.stream().anyMatch(product->product.getText().equalsIgnoreCase(productname));
		
		
		return match;
	}
	
}
