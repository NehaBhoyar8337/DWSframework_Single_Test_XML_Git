package com.cjc.DWS.Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cjc.DWS.Commons.Browser_Url;

public class FW_Registration_page  extends Browser_Url {
	
	 //WebDriver driver;
		
	 Logger log=Logger.getLogger(FW_Registration_page.class.getName());
	 
	   @FindBy(how=How.XPATH,using="//*[@id='gender-female']")
		WebElement gender;
		
	   @FindBy(name="FirstName")
	   WebElement firstName;
	   
		@FindBy(name="LastName")
		WebElement lastname;
		
		@FindBy(how=How.NAME,using="Email")
		WebElement email;
		
		@FindBy(how=How.NAME,using="Password")
		WebElement password;
		
		@FindBy(how=How.NAME,using="ConfirmPassword")
		WebElement confirmPassword;
		
		@FindBy(how=How.NAME,using="register-button")
		WebElement regButton;
		
		@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")
		WebElement continueButton;
	
		
		
		public FW_Registration_page(WebDriver driver)
		{
			this.driver=driver;
			log.info("FW_Registration_page Constructor");
	         		
		}
		
		public void details(String fst,String lst,String mail,String ps,String cps)
		{
			firstName.sendKeys(fst);
			lastname.sendKeys(lst);
			email.sendKeys(mail);
			password.sendKeys(ps);
			confirmPassword.sendKeys(cps);
			log.warn("Users Registration Data Enterd Successfully!");
		
			
		}
		
		
		
		public void gender()
		{
			gender.click();
			log.fatal("Clicked on Gender Button!");
		}
		
		public void registrationButton()
		{
			regButton.click();
			log.fatal("Clicked on Registration Button!");
		}
		
		public void continwButton()
		{
			continueButton.click();
			log.warn("Clicked on Continue Button!");
		}
		

}
