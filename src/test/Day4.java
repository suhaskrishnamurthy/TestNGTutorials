package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("Web Login for Home Loan");
	}
	
	@Test(dataProvider = "getData")
	public void MobileLoginHomeLoan(String username,String pwd)
	{
		System.out.println("Mobile Login for Home Loan");
		System.out.println(username);
		System.out.println(pwd);
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("API Login for Home Loan");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	
	@AfterTest
	public void lastexecuteion()
	{
		System.out.println("I will execute last");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		//1st combination- username and password with good credit history.
		//2nd combination- username and password with bad credit history.
		//3rd combination- fradulant credit history.
		
		data[0][0]= "firstusername";
		data[0][1]="firstpassword";
		
		data[1][0]= "secondusername";
		data[1][1]="secondpassword";
		
		data[2][0]= "thirdusername";
		data[2][1]="thirdpassword";
		
		return data;
	}


}
