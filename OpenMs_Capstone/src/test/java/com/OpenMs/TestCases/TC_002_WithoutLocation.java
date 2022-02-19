package com.OpenMs.TestCases;
	
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.OpenMs.Pages.HomePage;
	import com.OpenMs.Pages.LoginPage;
	import com.OpenMs.Utility.BaseClass;

	public class TC_002_WithoutLocation  extends BaseClass
	{
		HomePage homepage;
		LoginPage loginpage;
	 
		public TC_002_WithoutLocation() throws IOException {
			super();
		}
		
		@BeforeMethod
		public void SetUp() throws IOException {
		setup();
		loginpage = new LoginPage();
		}
		@Test
		public void loginTest2() throws InterruptedException, IOException
		{
			homepage=loginpage.login2(prop.getProperty("username"),prop.getProperty("password"));
			

		
		}
		
	}


