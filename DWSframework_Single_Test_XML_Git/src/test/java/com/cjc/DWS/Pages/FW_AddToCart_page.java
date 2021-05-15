package com.cjc.DWS.Pages;

import org.apache.log4j.Logger
;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cjc.DWS.Commons.Browser_Url;

public class FW_AddToCart_page extends Browser_Url {
	
	//WebDriver driver;
	
	Logger log=Logger.getLogger(FW_AddToCart_page.class.getName());

//giftCard	
	
	@FindBy(how=How.XPATH,using="//img[@alt='Picture of $25 Virtual Gift Card']")
	WebElement giftcard; //click
	
//	Recipient's Name:
	@FindBy(name="giftcard_2.RecipientName")
	WebElement reciName;
	
//Recipient's Email:
	@FindBy(name="giftcard_2.RecipientEmail")
	WebElement reciMail;
		
//Add to cart button  //click
		@FindBy(how=How.XPATH,using="//*[@id=\"add-to-cart-button-2\"]")
		WebElement addtoCart1;

//Books Link //click
		@FindBy(how=How.LINK_TEXT,using="Books")
		WebElement books;
		//Book Image
		@FindBy(how=How.XPATH,using="//img[@alt='Picture of Computing and Internet']")
		WebElement bookimg;
		//Book Quenty
		@FindBy(how=How.NAME,using="addtocart_13.EnteredQuantity")
		WebElement bookQntyty;
		//Addto cart 2
		@FindBy(how=How.XPATH,using="//input[@id='add-to-cart-button-13']")
		WebElement addtoCart2;

//Computers link
		@FindBy(how=How.LINK_TEXT,using="Computers")
		WebElement compLink;
       //Desktop Img in computers		
	  @FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/a/img")
	  WebElement deskImg;
      //1st Computer Image
	  @FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img")
	  WebElement fstCimg;
      //Computer Specification
	  //Processor
	  @FindBy(how=How.XPATH,using="//*[@id='product_attribute_72_5_18_65']")
	  WebElement processor;
	  //RAM
	  @FindBy(how=How.XPATH,using="//*[@id='product_attribute_72_6_19_91']")
	  WebElement ram;
	  //HDD
	  @FindBy(how=How.ID,using="product_attribute_72_3_20_58")
	  WebElement hdd;
	  //Software
	  @FindBy(how=How.ID,using="product_attribute_72_8_30_94")
	  WebElement soft;
	  //Qunt
	  @FindBy(how=How.ID,using="addtocart_72_EnteredQuantity")
	  WebElement Cqunt;
	 //Addto cart 3
	 @FindBy(how=How.ID,using="add-to-cart-button-72")
	 WebElement addtoCart3;
	  
//Jewelry	  
	  
	  @FindBy(how=How.XPATH,using="//li[@class='inactive']//a[normalize-space()='Jewelry']")
		WebElement jewelryclick;
		
		@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img")
		WebElement createjewelclick;
		
		@FindBy(how=How.NAME,using="product_attribute_71_10_16")
		WebElement length;
		
		@FindBy(how=How.ID,using="add-to-cart-button-71")
		WebElement jeweladd;
		
		 //Addto cart 4
		 @FindBy(how=How.ID,using="add-to-cart-button-71")
		 WebElement addtoCart4;
	  
//GiftCard	  
	public void giftCardImage(String rname,String rmail)
	{
		giftcard.click();
		log.info("Clicked on giftcard Image");
		
		/*
		 * } public void reciNameMail(String rname,String rmail) {
		 */	
		reciName.sendKeys(rname);
		reciMail.sendKeys(rmail);
		log.error("Successfully enter Receptant name and Mail");
		addtoCart1.click();
		log.error("Clicked on Gift card Add to cart button 1");
	}

//Book	
	public void bookLink(String bqunt)
	{
		books.click();
		log.fatal("Clicked on Book Link Successfully ");
		/*
		 * } public void bookImage() {
		 */
		bookimg.click();
		log.error("Clicked on Book Image");
		/*
		 * } public void bookAddToCart(String bqunt) {
		 */
		bookQntyty.clear();
		bookQntyty.sendKeys(bqunt);
		log.info("Books Quentity Selected Successfully");
		addtoCart2.click();
		log.error("Clicked on Gift card Add to cart button 2");
	}

//Computer	
	public void computerLink(String cqnt)
	{
		compLink.click();
		log.error("Clicked on Computer Link Successfully");
		/*
		 * } public void desktopLink() {
		 */
		deskImg.click();
		log.error("Clicked on Desktop Image Successfully");
		/*
		 * } public void compImg() {
		 */
		fstCimg.click();
		log.error("Clicked on 1st Computer Image Successfully");
		/*
		 * } public void cmpSpecification(String cqnt) {
		 */
	   processor.click();
	   log.info("Clicked on Processor Successfully");
	   ram.click();
	   log.info("Clicked on RAM Successfully");
	   hdd.click();
	   log.info("Clicked on HDD Successfully");
	   soft.click();
	   log.info("Clicked on SoftWare Successfully");
	   Cqunt.clear();
	   Cqunt.sendKeys(cqnt);
	   log.info("Set Computer Quntity Successfully");
	   addtoCart3.click();
		log.error("Clicked on Gift card Add to cart button 3");
   }
   
//Jewelry   
   public void jwelary(String jlnth) throws InterruptedException
   {
	   Thread.sleep(2000);
	   jewelryclick.click();
	   log.info("Clicked on Jwelary Link Successfully");
	   createjewelclick.click();
	   log.info("Clicked on Create Jwelary Successfully");
	   length.sendKeys(jlnth); 
	   addtoCart4.click();
		log.error("Clicked on Gift card Add to cart button 4");
   }
   

}
