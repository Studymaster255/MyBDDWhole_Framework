package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class SampleSrepDef {
	
	@Given("user create bdd framework")
	public void user_create_bdd_framework() {
	    
		System.out.println("New BDD framework created ");
		
	}

	@Then("add some assertion")
	public void add_some_assertion() {
	    Assert.assertSame("First Assertion", true, true);
	    System.out.println("First Assertion");
		
	}

	@Then("add assertion with steatment")
	public void add_assertion_with_steatment() {
	   Assert.assertEquals("Secound assertion", true, true);
	   System.out.println("Secound Assertion");
		
	}

}
