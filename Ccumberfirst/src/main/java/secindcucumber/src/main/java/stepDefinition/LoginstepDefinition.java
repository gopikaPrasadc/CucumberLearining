package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginstepDefinition {
WebDriver driver;

@Given("^go to app$")
public void go_to_app(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\U48342\\Desktop\\Interview\\84\\chromedriver_win32 (2)\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
}

@When("^with username$")
public void with_username() {
    	WebElement lg=driver.findElement(By.xpath("//a[@class='ico-login']"));
    	lg.click();
}

@Then("^enter password$")
public void enter_password(){
	WebElement title =driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
	   Assert.assertEquals(title.getText(), "Welcome, Please Sign In!");
}

@Then("^user needs to login$")
public void user_needs_to_login() {
	WebElement user=driver.findElement(By.xpath("//input[@id='Email']"));
	  user.sendKeys("gopikacek14@gmail.com");
	  WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
	  password.sendKeys("gopika123");
	  WebElement login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
   	  login.click();
  	JavascriptExecutor js=(JavascriptExecutor)driver;
   	js.executeScript("window.scrollBy(0,500)");
}

}
