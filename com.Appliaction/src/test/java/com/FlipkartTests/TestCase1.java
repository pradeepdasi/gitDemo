package com.FlipkartTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Flipkart.BaseTest;
import com.Flipkart.LoginPage;

public class TestCase1 extends BaseTest {

	String username="kumartest.d@gmail.com";
	String password="Pradeep123@";
	@Test
	public void login() throws Exception {

		loginpage.typeEamil(username,password);
		

	}

}
