package com.rahulsheetyacademy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjects.ConformationPage;
import com.PageObjects.LandingPage;
import com.PageObjects.cartPage;
import com.PageObjects.checkOutPage;
import com.PageObjects.orderPage;
import com.PageObjects.productCatalogue;

import rahulsheetyacademy.testcomponents.BaseTest;

public class submitOrderTest extends BaseTest {

	// public String productname = "ZARA COAT 3";
	public String email="kumartest.d@gmail.com";
	public String pwd="Pradeep123@";

	@Test(dataProvider="getData",groups={"Purchase"})
	public void submitOrder(String emailuser,String password,String productname) throws Exception {

		productCatalogue product = landingpage.loginApplication(emailuser, password);
		List<WebElement> products = product.getProductList();
		product.addProductToCart(productname);
		cartPage cartpage = product.goToCarPage();

		Boolean match = cartpage.VerifyProductDisplay(productname);
		Assert.assertFalse(match);
		checkOutPage checkoutpage = cartpage.goTocheckout();
		checkoutpage.selectcountry("india");
		ConformationPage confirmationapage = checkoutpage.submitOrder();

		String confirmationpage = confirmationapage.getconfirmationMessage();

		AssertJUnit.assertTrue(confirmationpage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		// driver.close();

	}

	@Test(dependsOnMethods = { "submitOrder" })
	public void orderHistory(String email, String password, String productname) {
		//String productname = "ZARA COAT 3";
		productCatalogue product = landingpage.loginApplication("email", "password");
		orderPage orderspage = product.goToOrderspage();
		Assert.assertTrue(orderspage.verifyOrderDisplay(productname));
	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { {email,pwd,"ZARA COAT 3" },
				{ "pradeepd@gmail.com", "12345", "ADIDAS ORIGINAL" } };
	}
}
