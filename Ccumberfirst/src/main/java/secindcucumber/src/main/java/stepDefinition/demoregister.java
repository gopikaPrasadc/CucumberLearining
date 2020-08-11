package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoregister {
WebDriver driver;

@Given("^naviagte homepage$")
public void naviagte_homepage() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\U48342\\Desktop\\Interview\\84\\chromedriver_win32 (2)\\chromedriver.exe\\");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
}

@Then("^clik reg$")
public void clik_reg() {
	WebElement rg=driver.findElement(By.xpath("//a[@class='ico-register']"));
	rg.click();
}

@When("^select gender$")
public void select_gender() {
	List<WebElement> radio= driver.findElements(By.xpath("//input[@type='radio']"));
	radio.get(1).click();
	
}

@Then("^enter your personal details$")
public void enter_your_personal_details(DataTable table1) { 
	for(Map<String, String> data : table1.asMaps(String.class, String.class)) {
		driver.findElement(By.id("FirstName")).sendKeys(data.get("name"));
		driver.findElement(By.id("LastName")).sendKeys(data.get("lastame"));
		driver.findElement(By.id("Email")).sendKeys(data.get("mail id  "));
		driver.findElement(By.id("Password")).sendKeys(data.get("password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get("confirmpass"));
	}	
	}
	
	@Then("^I should click on Register button$")
	public void clickbuttin() {
			driver.findElement(By.id("register-button")).click();
	}


	




}
