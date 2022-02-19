package com.OpenMs.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OpenMs.Pages.CaptureVitals_Page;
import com.OpenMs.Pages.FindPatientRecord;
import com.OpenMs.Pages.HomePage;
import com.OpenMs.Pages.LoginPage;
import com.OpenMs.Utility.BaseClass;

public class TC_004_verify_RoberTaylor_Id extends BaseClass
{
	HomePage homepage;
	LoginPage loginpage;
	CaptureVitals_Page cvp;
	
	public TC_004_verify_RoberTaylor_Id() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void SetUp() throws IOException {
	setup();
	loginpage = new LoginPage();
	}
	
	@Test
	public void searchpatientID() throws InterruptedException, IOException
	{
		
        homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
         cvp=new CaptureVitals_Page();
         cvp.verifyingID();
        

}}
