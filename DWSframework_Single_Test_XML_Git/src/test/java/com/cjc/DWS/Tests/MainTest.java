package com.cjc.DWS.Tests;

import java.io.File;
import java.io.FileInputStream;



import java.io.IOException;
import java.util.Properties;

import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cjc.DWS.Commons.Browser_Url;
import com.cjc.DWS.Pages.FW_AddToCart_page;
import com.cjc.DWS.Pages.FW_PaymentGateWay_page;
import com.cjc.DWS.Pages.FW_Registration_page;
import com.cjc.DWS.Pages.FW_ShoppingCart_page;

@Listeners(com.cjc.DWS.Commons.DWS_Listener.class)
public class MainTest extends Browser_Url {
		
	//WebDriver driver;
    Logger log=Logger.getLogger(MainTest.class.getName());
	
	Properties pro=new Properties();
	
	@Test(priority=1)
	@Parameters({"fname","lname","emailid","password","Cpassword"})
	public void registrationTest(String fname,String lname,String emailid,String password,String Cpassword) throws InterruptedException, IOException 
	{
		FW_Registration_page fwrp=PageFactory.initElements(driver, FW_Registration_page.class);
		 
			//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            fwrp.gender();
			fwrp.details(fname,lname,emailid,password,Cpassword);
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFileToDirectory(src,new File("D:\\selenium\\DWSframework_Single_Test_XML\\ScreenShot.jpeg"));
			fwrp.registrationButton();
			//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			Thread.sleep(2000);
			fwrp.continwButton();		
	}

	
	@Test(priority=2)
	@Parameters({"rname","rmail","bqunt","cqnt","jlnth"})
	public void addToCartTest(String rname,String rmail,String bqunt,String cqnt,String jlnth) throws IOException, InterruptedException
	{
		FW_AddToCart_page atc=PageFactory.initElements(driver, FW_AddToCart_page.class);
		 
		atc.giftCardImage(rname,rmail);
		Thread.sleep(2000);
		atc.bookLink(bqunt);
		Thread.sleep(2000);
		atc.computerLink(cqnt);
		Thread.sleep(2000);
		atc.jwelary(jlnth);
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	@Parameters({"Countrybill","Zipcode"})
	public void shoptest(String Countrybill,String Zipcode) throws IOException, InterruptedException
	{
		FW_ShoppingCart_page rp = PageFactory.initElements(driver, FW_ShoppingCart_page.class);
		rp.cartclick();
		Thread.sleep(3000);
		rp.shopdata(Countrybill,Zipcode);
		Thread.sleep(3000);
		rp.shopingdata();
	}

	@Test(priority=4)
	@Parameters({"Companyname","Countrybill","Cityname","addr1","addr2","Zipcode","Mobno"})
	public void checkouttest(String Companyname,String Countrybill,String Cityname,String addr1,String addr2,String Zipcode,String Mobno) throws IOException, InterruptedException
	{
		FW_PaymentGateWay_page rp = PageFactory.initElements(driver, FW_PaymentGateWay_page.class);

		rp.Checkoutdata(Companyname,Countrybill,Cityname,addr1,addr2,Zipcode,Mobno);
		Thread.sleep(3000);
		rp.pickup();
		Thread.sleep(3000);
		rp.orderno();
		
		
	}
	
	
	

}
