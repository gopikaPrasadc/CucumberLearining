package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimplesetpDefinition {
WebDriver driver;


@Given("^I want to navigate into newtours$")
public void i_want_to_navigate_into_newtours() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\U48342\\Desktop\\Interview\\84\\chromedriver_win32 (2)\\chromedriver.exe\\");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/newtours/");
}


@When("^able to enter \"([^\"]*)\"$")
public void able_to_enter_something( String uname) {
	WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
	  user.sendKeys(uname);
}



@Then("^password \"([^\"]*)\"$")
public void password(String password) {
	WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	  pass.sendKeys(password);
}

@When("^able to click on login button$")
public void able_to_click_on_login_button(){
	WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
	submit.click();
	driver.close();
}





}
