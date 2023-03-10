package com.Flipakart;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	//wherever you asign the before class to any particular class only that class itself working rest of the classes not to be taken only for this class 
	@BeforeClass
	public static void firstclass() {//before class is working onley which class you asign only that class exceute itself rest of the classes not be consider or taken
		System.out.println("before class execute");//beforeclass ,beforemethod test after method after class etc this is the flow
	}
	@AfterClass
	public static void lastclass() {
		System.out.println("after class exceute");
	}
	@Parameters({"URL"})
	@Test
	public static void webLoginCArLoan(String urlname) {
		System.out.println("WeblogCarLoan is avaialable");
		System.out.println(urlname);
	}
	@BeforeMethod
	public static void beforeone() {
		System.out.println("before method executes firs every test method ");//like beforemethod test beforemethod test beforemethod test etc...
	}
	@AfterMethod
	public static void afterone() {
		System.out.println("after method ones execute last after test ");//beforemethod test aftermethod
	}
	@Test
	public static void InsuranceCArLoan() {
		System.out.println("InsuranceCarLoan is avaialable");
	}
	@Test
	public static void APICArLoan() {
		System.out.println("APICarLoan is avaialable");
		
	}
	@AfterSuite
	public static void lastsuit() {
		System.out.println("bye...");
	}

}
