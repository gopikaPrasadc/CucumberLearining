package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Testing\\eclipse\\secindcucumber\\src\\main\\java\\feature\\tags.feature",
		glue= {"stepDefinition"},
		dryRun=false,
		//strict = true, //checks the mapping between feature and stepdefinitions
		monochrome = true, // to make readable output in console
		format = {"pretty","html:test-outout"},
		//tags= {"@smokeTest"}
		tags={"@InvalidTest "}
		)
		
public class Testrunner {

}
