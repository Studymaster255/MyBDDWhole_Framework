package StepDefination;

import org.openqa.selenium.Keys;

import BaseLayer.BaseClass;
import PageLayer.TvBuyNowPage;
import UtilsLayer.HandleWindow;
import UtilsLayer.TakeScreenshot;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TvbuyNowStepDef extends BaseClass {
	TvBuyNowPage tvbuynow=null;
	
	
	@When("user searches {string}")
	public void user_searches(String tvname) {
		tvbuynow=new TvBuyNowPage();
		tvbuynow.searchContent(tvname);
//		final String path="F:\\FlipcartOwnBDD\\Flipcart\\PassedScreenshot";
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		TakeScreenshot.takeScreenshot(path,"tvname");
		
	}
	@Then("click on first item")
	public void click_on_first_item() {
		tvbuynow.clickOnFirstResult();
		HandleWindow handlewindow=new HandleWindow();
		handlewindow.switchTowindow(1);
//		final String path="F:\\FlipcartOwnBDD\\Flipcart\\PassedScreenshot";
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		TakeScreenshot.takeScreenshot(path,"searchresulttv");
		
	}
	@Then("click on buynow")
	public void click_on_buynow() {
		tvbuynow.clickOnByuNow();
//		final String path="F:\\FlipcartOwnBDD\\Flipcart\\PassedScreenshot";
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		TakeScreenshot.takeScreenshot(path,"tvassert");
	}
	

}
