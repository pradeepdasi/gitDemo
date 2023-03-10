package com.abstarctComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageObjects.cartPage;
import com.PageObjects.orderPage;

public class abstarctComponent {

	WebDriver driver;
	public abstarctComponent(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="[routerlink*='cart']")
	WebElement cartHeader;
	@FindBy(css="[routerlink*='myorders']")
	WebElement OrdersHeader;
	
	//driver.findElement(by.cssSelector("[routerlinl*='cart']")).click();//idi above @findby creat checochu deeni valla
	public  cartPage goToCarPage() {
		cartHeader.click();
		cartPage cartpage=new cartPage(driver);
		System.out.println("cart page running");
		return cartpage;
	}
	public orderPage goToOrderspage() {
		OrdersHeader.click();
		orderPage orderpage=new orderPage(driver);
		System.out.println("orderpage is started");
		return orderpage;
	}
	public void waitForWebElementappear(WebElement ele) {
		  WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5)); 
		  wait.until(ExpectedConditions.visibilityOf(ele)) ;
	}
	public void waitForElementToAppear(By findBy) {
		  WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5)); 
	  wait.until(ExpectedConditions.visibilityOfElementLocated(findBy)) ;
	  }
	
	public void waitForElementDissappear(WebElement ele) {
		  WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5)); 
	  wait.until(ExpectedConditions.invisibilityOf(ele)) ;
	  }
	
	
}
