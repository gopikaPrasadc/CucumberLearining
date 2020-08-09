package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class SimpleDataDrivenRunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="D:\\Testing\\eclipse\\Ccumberfirst\\src\\main\\java\\feature\\Simple.feature",//to set the feature login path
			glue= {"SimpleDataDrivenStepDefinition"}, //to set the stepdefinition path
			

	dryRun =true, //checks the mapping between feature and stepdefinitions
	strict = false, //checks the mapping between feature and stepdefinitions
	monochrome = true, // to make readable output in console
	format = {"pretty","html:test-outout"})
	public class Testrunner {

	}
}
