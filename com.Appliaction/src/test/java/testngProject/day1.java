package testngProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	
	
	@Test
	public void m1() {
		System.out.println("m1 mthod");
	}
	@Parameters({"UrL"})
	@Test
	public void m2(String urlName) {
		System.out.println("m2 mthod");
		
		
		
	}
	
	@Test(dataProvider ="getData")
	public void weblogicloan(String username,String password){
		System.out.println(username);
		System.out.println(password);
		
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[3][2];
		data[0][0]="username1";
		data[0][1]="password1";
		
		data[1][0]="username2";
		data[1][1]="password2";
		
		data[2][0]="username3";
		data[2][1]="password3";
		
		return data;
	}
	
	@Test
	public void m3() {
		System.out.println("m3 mthod");
		//System.out.println(urlusernam);
	}
	@Test(dependsOnMethods = {"m1"})
	public void m4() {
		System.out.println("m4 mthod");
	}
	@AfterMethod
	public void m5() {
		System.out.println("m5 after mthod");
	}
	@BeforeMethod
	public void m6() {
		System.out.println("m6 before mthod");//m6,m1,m5,m6,m2,m5,m6,m3,m5
	}

}
