package com.OpenMs.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OpenMs.Pages.HomePage;
import com.OpenMs.Pages.LoginPage;
import com.OpenMs.Utility.BaseClass;

public class TC_001_Verify_login extends BaseClass
{
	HomePage homepage;
	LoginPage loginpage;
 
	public TC_001_Verify_login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void SetUp() throws IOException {
	setup();
	loginpage = new LoginPage();
	}
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));

		System.out.println("loginTest is passed");
	}
/*	@AfterTest
	public void teardown()
	{
		loginpage.teardown();
	}
	
	*/
	
}
