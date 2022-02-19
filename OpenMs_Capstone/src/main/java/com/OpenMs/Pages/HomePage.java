package com.OpenMs.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OpenMs.Utility.BaseClass;

public class HomePage extends BaseClass
{

	 @FindBy(xpath = "//div[@id='apps'] /a[1]")

	  WebElement  findpatientRecord;
	 
	 
	  public HomePage() throws IOException
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	
	  public  FindPatientRecord patientRecord() throws InterruptedException, IOException
	  {
		 
		  findpatientRecord.click();
		 		  
		  return new FindPatientRecord();
	  }
	
}
