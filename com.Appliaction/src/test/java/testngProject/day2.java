package testngProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {
	
	@BeforeSuite
	public void m7() {
		System.out.println("i will be executing first");
	}
	@AfterSuite
	public void m8() {
		System.out.println("i will be executing last");
	}
	@BeforeClass
	public void m9() {
		System.out.println("m9 mthod willbe second");
	}
	@AfterClass
	public void m10() {
		System.out.println("m10 method will be execute  second from last");
	}
	@Test
	public void FIFAWorlCup() {
		System.out.println("fifla worl cup");
	}
	@Test(groups= {"smoke"})
	public void m11() {
		System.out.println("m11 method");
	}
	@Test(groups= {"sanity"})
	public void m12() {
		System.out.println("m12 mthod");
	}
	@AfterMethod
	public void m13() {
		System.out.println("m13 after mthod ");
	}
	@BeforeMethod
	public void m14() {
		System.out.println("m14 before mthod");//suit class beforemetho test aftermehtod beforemetho test aftermehtod classs suit
	}

}
