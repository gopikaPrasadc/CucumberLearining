package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datadrivenexampl {

	WebDriver driver;
	
	@Given("^launch Application$")
	public void launch_Application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\U48342\\Desktop\\Interview\\84\\chromedriver_win32 (2)\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
	}

	@When("^input \"([^\"]*)\"$")
	public void input(String username) {
		WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
		  user.sendKeys(username);
	}

	@Then("^enter \"([^\"]*)\"$")
	public void enter(String password){
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		  pass.sendKeys(password);
	}

	@When("^click button$")
	public void click_button() {
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		driver.close();
	}



}
