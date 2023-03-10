package com.Flipakart;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	@AfterTest
	public static void lastExceution() {
		System.out.println("this is last execution");
		
	}
	@BeforeSuite
	public static void main() {
		System.out.println("i will be the first suit excuting");
	}

	@Test
	public static void FirstApp() {
		System.out.println("applicatin one start...");
	}
	@Test
	public static void SecondApp() {
		System.out.println("applicatin two start...");
		
	}
	
	@BeforeTest
	public static void firstExecute() {
		System.out.println("it will firts execute");
	}
	
}
