package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String urlname)
	{
		System.out.println("Web Login for Car Loan");
		System.out.println(urlname);
	}
	@Test(groups= {"Smoke"})
	public void MobileLogoutCarLoan()
	{
		System.out.println("Mobile Logout for Car Loan");
	}
	
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("Mobile Login for Car Loan");
	}
	
	@Test
	public void MobileSigninCarLoan()
	{
		System.out.println("Mobile Signin for Car Loan");
	}
	
	@Test
	public void MobileSignoutCarLoan()
	{
		System.out.println("Mobile Signout for Car Loan");
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPICarLoan()
	{
		System.out.println("API Login for Car Loan");
	}

}
