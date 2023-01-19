package PageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class TvBuyNowPage extends BaseClass {
	
	@FindBy(name="q")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	WebElement searchbtn;
	
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	WebElement firstitem;
	
	@FindBy(xpath="//button[text()='Buy Now']")
	WebElement buyNowbtn;
	
	public TvBuyNowPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchContent(String value)
	{
		UtilsClass.enter_Data(searchbox, value);
		UtilsClass.click_On_Element(searchbtn);
	}
	
	public void clickOnFirstResult()
	{
		UtilsClass.click_On_Element(firstitem);
	}
	
	public void clickOnByuNow()
	{
		UtilsClass.click_On_Element(buyNowbtn);
	}
}
