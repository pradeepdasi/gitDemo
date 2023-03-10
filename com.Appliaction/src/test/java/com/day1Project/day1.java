package com.day1Project;

import org.testng.annotations.Test;

public class day1 {

	@Test(groups={"smoke"})
	public static void pLoan() {
		System.out.println("good");
	}
	
	@Test
	public static void prerequiste() {
		System.out.println("i will execute first");
		
	}
}
