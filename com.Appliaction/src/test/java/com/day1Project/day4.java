package com.day1Project;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//if you run through testng.xml its working only alphabet through comes output but requirement is to be excute client required is different 
//in that scenario we use depends on method.

public class day4 {
	@Test(groups = { "smoke" })
	public static void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHomeLoan is avaialable");
	}
@Parameters({"URL"})
	@Test
	public static void InsuranceHomeLoan(String urlname) {
		System.out.println("InsuranceHomeLoan is avaialable");
		System.out.println(urlname);
	}

	@Test
	public static void APIHomeLoan() {
		System.out.println("APIHomeLoan is avaialable");
		System.out.println();

	}
}
