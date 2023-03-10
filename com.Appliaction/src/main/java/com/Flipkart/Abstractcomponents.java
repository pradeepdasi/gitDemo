package com.Flipkart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abstractcomponents  {
	public WebDriver driver;
	

	public Abstractcomponents(WebDriver driver) {
		
		this.driver=driver;
	}

	
	  public void waitForElementToAppear() {
		  WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5)); 
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb5"))) ;
	  }
	 
	

	

}
