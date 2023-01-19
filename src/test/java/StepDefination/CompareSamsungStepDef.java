package StepDefination;

import java.lang.reflect.Method;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.logging.log4j.*;
import BaseLayer.BaseClass;
import PageLayer.CompareSamsungPage;
import UtilsLayer.CurrentDateAndTime;
import UtilsLayer.HandleWindow;
import UtilsLayer.TakeScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CompareSamsungStepDef extends BaseClass {
	CompareSamsungPage compareSamsungPage=null;
	BaseClass base;
	Logger log=LogManager.getLogger("CompareSamsungStepDef");
	@Given("user launch borwser")
	public void user_launch_borwser() {
		base=new BaseClass();
		base.initilization();
		log.info("user launch borwser");
	}

	@Given("user opens flipcart.com")
	public void user_opens_flipcart_com() {
		Assert.assertEquals("https://www.flipkart.com/",driver.getCurrentUrl());
		log.info("user opens flipcart.com");
		}

	@Given("user cancles login popup")
	public void user_cancles_login_popup() {
		compareSamsungPage=new CompareSamsungPage();
		compareSamsungPage.clickOnPopup();
		log.info("user cancles login popup");
	}

	@Then("user can view homepage")
	public void user_can_view_homepage() {
		Assert.assertEquals("https://www.flipkart.com/",driver.getCurrentUrl());
		log.info("user can view homepage");	
	}

	@When("user click on Mobile&Tablet")
	public void user_click_on_mobile_tablet() {
		compareSamsungPage.clickOnMobileAndTablet();
		log.info("user click on Mobile&Tablet");
	}

	@When("user click on electronics and samsung")
	public void user_click_on_electronics_and_samsung() {
		compareSamsungPage.clickOnelEctronicThenSamsung();
		log.info("user click on electronics and samsung");
	}

	@When("click on SAMSUNG Galaxy A53")
	public void click_on_samsung_galaxy_a53() {
		compareSamsungPage.clickOnA53();
		log.info("click on SAMSUNG Galaxy A53");
	}

	@When("click on Compare and Compare")
	public void click_on_compare_and_compare() {
		HandleWindow handlewindow=new HandleWindow();
		//		HandleWindow.handleMultipleWindow();
		//		handlewindow.handleWindows();
		handlewindow.switchTowindow(1);
		compareSamsungPage.clickOnCompareAndCompare();
		System.out.println(driver.getTitle());
		//		final String path="F:\\FlipcartOwnBDD\\Flipcart\\PassedScreenshot";
		//		try {
		//			Thread.sleep(3000);
		//		} catch (InterruptedException e) {
		//			e.printStackTrace();
		//		}
		//		TakeScreenshot.takeScreenshot(path, "abc");
		log.info("click on Compare and Compare");

	}

	@When("select another three mobiles")
	public void select_another_three_mobiles() {
		compareSamsungPage.clickOnAnotherFirstMob();
		//		final String path="F:\\FlipcartOwnBDD\\Flipcart\\PassedScreenshot";
		//		try {
		//			Thread.sleep(3000);
		//		} catch (InterruptedException e) {
		//			e.printStackTrace();
		//		}
		//		TakeScreenshot.takeScreenshot(path,"first");
		log.info("select another three mobiles");
	}

	@Then("add to cart who have maximum Reviews")
	public void add_to_cart_who_have_maximum_reviews() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		compareSamsungPage.clickOnBuyNow();
		System.out.println("==============");
		log.info("add to cart who have maximum Reviews");
	}

	@Then("validate {string}")
	public void validate(String safeline) {
		Assert.assertEquals(compareSamsungPage.assertLine(), safeline);
		//		final String path="F:\\FlipcartOwnBDD\\Flipcart\\PassedScreenshot";
		//		try {
		//			Thread.sleep(3000);
		//		} catch (InterruptedException e) {
		//			e.printStackTrace();
		//		}
		//		TakeScreenshot.takeScreenshot(path,"last");
		log.info("validate {string}");
	}

	@After
	public void teardown()
	{	
		log.info("----------end of logs----------");
		driver.quit();
	}

	@AfterStep
	public void addScreenshot(Scenario scenario){
	//	String a="";
			final byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs 
					(OutputType. BYTES) ;
			// attach image file report(data, media type, name of the attachment)
			scenario.attach(screenshot,"image/png",scenario.getName());
			
			//log.info(scenario.getName());
			

	}

}

