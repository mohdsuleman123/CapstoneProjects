package com.OpenMs.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FindPatientRecord extends HomePage {


	  @FindBy(xpath = "//div[@id='apps'] /a[1]")
	  WebElement findpatientRecordTAB;
	  
	  @FindBy(xpath = "//input[@id='patient-search']")
	  WebElement searchPatient;
	
	  @FindBy(xpath = " //tbody[@role='alert']//td[2]")
	  WebElement RobertLoc;
	
	
	public FindPatientRecord() throws IOException
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public CaptureVitals_Page searchpat() throws InterruptedException, IOException
	{
		findpatientRecordTAB.click();
		searchPatient.sendKeys("Robert Taylor");
		Thread.sleep(2000);
		String exp="Robert Taylor";
		String act = RobertLoc.getText();
		Assert.assertEquals(exp, act);
		System.out.println("Robert patient is present");
		return new CaptureVitals_Page();
	}
        
}
