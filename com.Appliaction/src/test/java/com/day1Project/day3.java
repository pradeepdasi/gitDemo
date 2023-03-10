package com.day1Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



//if you run through testng.xml its working only alphabet through comes output but requirement is to be excute client required is different 
//in that scenario we use depends on method.

public class day3 {

	@BeforeClass
	public static void firstclass() {
		System.out.println("before class execute");
	}

	@AfterClass
	public static void lastclass() {
		System.out.println("after class exceute");
	}
	@Parameters({"URL"})
	//using for environment variables or url or utility related paramters use only folderlevel or 
	//or test level but when it methods levelthere is another annotation is dataproviders
	
	@Test
	public static void Tax(String urlName) {
		System.out.println("must pay tax to govt");
		System.out.println(urlName);
	}
	
	@Test(dataProvider = "getData")
	
	public static void webLogicLoan(String username,String password) {
		System.out.println("WeblogicLoan is avaialable");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(timeOut=5000)//this is giving time out test taking longer time than this in this scenario test case fail .or not 
	public static void webLoginCArLoan() {
		System.out.println("WeblogCarLoan is avaialable");
	}

	@BeforeMethod
	public static void beforeone() {
		System.out.println("before method executes firs every test method ");
	}

	@AfterMethod
	public static void afterone() {
		System.out.println("after method ones execute last after test ");
	}

	@Test(enabled=false)//skip the test when you want to see he output put true (enable=true)then
	public static void InsuranceCArLoan() {
		System.out.println("InsuranceCarLoan is avaialable");
	}
//output 
	/*
	 * before class execute before method executes firs every test method
	 * WeblogCarLoan is avaialable after method ones execute last after test before
	 * method executes firs every test method InsuranceCarLoan is avaialable after
	 * method ones execute last after test before method executes firs every test
	 * method APICarLoan is avaialable after method ones execute last after test
	 * after class exceute PASSED: InsuranceCArLoan PASSED: webLoginCArLoan PASSED:
	 * APICArLoan
	 */

	@Test(dependsOnMethods = {"webLoginCArLoan","Tax"})
	public static void APICArLoan() {
		System.out.println("APICarLoan is avaialable");

	}

	@AfterSuite
	public static void lastsuit() {
		System.out.println("bye...");
	}
@DataProvider
	public Object[][] getData() {
		//1st combination of history:username password :good credit history
	//2nd combination of history:username password :no credit history
	//3rd combination of history:username password :fraudlent credit history
	
	Object[][] data=new Object[3][2];
	//1st set of data
	data[0][0]="username123";
	data[0][1]="password123";
	
	//2nd set of data
	
	data[1][0]="username1";
	data[1][1]="password1";
	//3rd set of data
	data[2][0]="username2";
	data[2][1]="password2";
	return data;
	
	}
}
