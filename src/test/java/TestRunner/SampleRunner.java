package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatures"},
		glue= {"StepDefination"},
		dryRun=false,
		plugin={"pretty","html:CucumberReports/BydefaultSampleReport.html"}

		
		)

public class SampleRunner {

}
