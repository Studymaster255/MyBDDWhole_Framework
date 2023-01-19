package PageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;
import io.opentelemetry.api.internal.Utils;

public class CompareSamsungPage extends BaseClass {
	
	
	//@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	@FindBy(xpath="//button[text()='✕']")
	WebElement popup_closebtn ;
	
	@FindBy(xpath="//div[text()='Mobiles & Tablets']")
	WebElement mobileAndTablet ;
	
	@FindBy(xpath="//span[text()='Electronics']")
	WebElement electronics ;
	
	@FindBy(xpath="//a[@href='/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung']")
	WebElement samsungUnderElectronic ;
	
	@FindBy(xpath="(//div[@class='_28_T72'])[1]")
	WebElement a53 ;
	
	@FindBy(xpath="//label[text()='Compare']")////label[@class='_6Up2sF']
	WebElement compareCheckBox ;
	
	@FindBy(xpath="//span[@class='_3hShhO']")
	WebElement comparepopup ;
	
	
	@FindBy(xpath="(//div[@class='_1EDlbo _17qiPn'])[1]")
	WebElement brandDD_1 ;
	
	@FindBy(xpath="(//div[text()='SAMSUNG'])[1]")
	WebElement samsungUnderDD;
	
	@FindBy(xpath="(//div[text()='Choose a Product'])[1]")
	WebElement chooseProduct_1 ;
	
	@FindBy(xpath="//div[text()='SAMSUNG Galaxy S21 FE 5G (Lavender, 128 GB)']")
	WebElement s21underchooseProduct;
	
	/*@FindBy(xpath="(//div[@class='_1EDlbo _17qiPn'])[2]")
	WebElement brandDD_2 ;
	
	@FindBy(xpath="(//div[text()='Choose a Product'])[2]")
	WebElement chooseProduct_2 ;
	
	@FindBy(xpath="//div[text()='SAMSUNG Galaxy S21 FE 5G (Lavender, 128 GB)']")
	WebElement m04underchooseProduct;
	
	@FindBy(xpath="(//div[@class='_1EDlbo _17qiPn'])[3]")
	WebElement brandDD_3 ;
	
	@FindBy(xpath="(//div[text()='Choose a Product'])[3]")
	WebElement chooseProduct_3 ;
	*/
	
	@FindBy(xpath="(//button[text()='Buy Now'])[2]")
	WebElement buyNow;
	
/*	@FindBy(xpath="//span[@class='_2_R_DZ FIvxZg']")
	WebElement review;	*/
	
	@FindBy(xpath="//span[@class='s3KDM9']")
	WebElement authenticLine;	
	
	public CompareSamsungPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPopup()
	{
		UtilsClass.click_On_Element(popup_closebtn);
		
	}
	
	public void clickOnMobileAndTablet()
	{
		UtilsClass.click_On_Element(mobileAndTablet);
	
	}
	
	public void clickOnelEctronicThenSamsung()
	{
		UtilsClass.click_On_Element(electronics);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UtilsClass.click_On_Element(samsungUnderElectronic);
	}
	
	public void clickOnA53()
	{
		UtilsClass.click_On_Element(a53);
	}
	
	public void clickOnCompareAndCompare()
	{
		UtilsClass.click_On_Element(compareCheckBox);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UtilsClass.click_On_Element(comparepopup);
	}
	//next step associted methods pending
	public void clickOnAnotherFirstMob()
	{
		UtilsClass.click_On_Element(brandDD_1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UtilsClass.click_On_Element(samsungUnderDD);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UtilsClass.click_On_Element(chooseProduct_1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UtilsClass.click_On_Element(s21underchooseProduct);
	}
	/*public void clickOnAnotherSecoundMob()
	{
		UtilsClass.click_On_Element(brandDD_2);
		UtilsClass.click_On_Element(samsungUnderDD);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UtilsClass.click_On_Element(chooseProduct_2);
		UtilsClass.click_On_Element(m04underchooseProduct);
	}*/
	
	public void clickOnBuyNow()
	{
		UtilsClass.click_On_Element(buyNow);
	}
	
	public String assertLine()
	{
		return authenticLine.getText();
	}
	
}
