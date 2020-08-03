package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Testing\\eclipse\\Ccumberfirst\\src\\main\\java\\feature\\Login.feature",//to set the feature login path
		glue= {"stepDefinition"} //to set the stepdefinition path
		)
public class Testrunner {

}
