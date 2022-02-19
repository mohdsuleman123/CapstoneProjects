package com.OpenMs.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OpenMs.Utility.BaseClass;

public class LoginPage extends BaseClass {

		  @FindBy(xpath = "//input[@name='username']")
		  WebElement username;
		  
		  @FindBy(xpath = "//input[@name='password']")
		  WebElement password;
		  
		  @FindBy(xpath = "//li[@id='Inpatient Ward']")
		  WebElement inpatientWard;
		  
		  @FindBy(xpath = "//input[@class='btn confirm']")
		  WebElement loginButton;
		  
		  @FindBy(xpath = "//span[@class='location-error']")
		  WebElement locError;
		  
		
		  
		  public LoginPage() throws IOException
		  {
			  PageFactory.initElements(driver, this);
		  }
		  
		  
		  public  HomePage login(String un , String pwd) throws InterruptedException, IOException
		  {
			  username.sendKeys(un);
			//  Thread.sleep(2000);
			  password.sendKeys(pwd);
			  inpatientWard.click();
			  loginButton.click();
			  
			  return new HomePage();
		  }
		  
		  public  HomePage login2(String un , String pwd) throws InterruptedException, IOException
		  {
			  username.sendKeys(un);
			//  Thread.sleep(2000);
			  password.sendKeys(pwd);
			  loginButton.click();
			 
			  System.out.println( locError.getText());
			  
			  return new HomePage();
		  }
		  
		  
		
	
}
