package com.OpenMs.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OpenMs.Pages.FindPatientRecord;
import com.OpenMs.Pages.HomePage;
import com.OpenMs.Pages.LoginPage;
import com.OpenMs.Utility.BaseClass;

public class TC_003_SearchPatient extends BaseClass {

	HomePage homepage;
	LoginPage loginpage;
	FindPatientRecord fpr;
	
	
	public TC_003_SearchPatient() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void SetUp() throws IOException {
	setup();
	loginpage = new LoginPage();
	}
	
	@Test
	public void searchpatient() throws InterruptedException, IOException
	{
		
        homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
        fpr=new FindPatientRecord();
        fpr.searchpat();
	
	}
}
