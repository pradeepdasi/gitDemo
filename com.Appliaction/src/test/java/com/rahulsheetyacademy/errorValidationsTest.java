package com.rahulsheetyacademy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.PageObjects.LandingPage;
import com.PageObjects.cartPage;
import com.PageObjects.productCatalogue;

import rahulsheetyacademy.testcomponents.BaseTest;

public class errorValidationsTest  extends BaseTest{
	
	@Test(groups= {"ErrorHandling"})
	public void submitOrder() {
		
		String productname = "ZARA COAT 3";
		productCatalogue product = landingpage.loginApplication("pradeep.d@gmail.com", "Pradeep123");
	AssertJUnit.assertEquals("Incorrect email or password",landingpage.geterrorMessage());
		
		
	}
	@Test
	public void ProductErrorValidation() {
		String productname = "ZARA COAT 3";
		productCatalogue product = landingpage.loginApplication("kumartest.d@gmail.com", "Pradeep123@");
		List<WebElement> products = product.getProductList();
		product.addProductToCart(productname);
		cartPage cartpage = product.goToCarPage();
	}

}
