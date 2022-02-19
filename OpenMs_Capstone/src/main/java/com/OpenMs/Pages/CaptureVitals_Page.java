package com.OpenMs.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.OpenMs.Utility.BaseClass;

public class CaptureVitals_Page extends BaseClass {


	  @FindBy(xpath = "//div[@id='apps'] /a[4]  ")
	  WebElement captureVitalTAB;
	

	  @FindBy(xpath = "//input[@id='patient-search']")
	  WebElement searchtextfield;
	  
	  @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]")
	  WebElement id;
	  
	  public CaptureVitals_Page() throws IOException
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	
	  public void verifyingID() throws InterruptedException, IOException
	  {
		  captureVitalTAB.click();
		  searchtextfield.sendKeys("Robert Taylor");
		  Thread.sleep(3000);
		  String act="1002KL";
		  
		  String exp = id.getText();
		  System.out.println(exp);
		  
		  if(act.equalsIgnoreCase(exp))
				  {
				  System.out.println("Robert Taylor ID id verified");
				  }
	  }
}
