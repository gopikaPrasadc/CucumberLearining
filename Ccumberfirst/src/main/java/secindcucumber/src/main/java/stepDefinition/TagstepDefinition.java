package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TagstepDefinition {

	public WebDriver driver;
	

	@Given("^loginpage enter$")
	public void loginpage_enter() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\U48342\\Desktop\\Interview\\84\\chromedriver_win32 (2)\\chromedriver.exe\\");
		 driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com");
		 WebElement button=driver.findElement(By.xpath("//a[@class='ico-login']"));
	 	 button.click();
	}

	@Then("^username entered$")
	public void username_entered() {
		WebElement mail=driver.findElement(By.xpath("//input[@id='Email']"));
		mail.sendKeys("gopikacek14@gmail.com");
	}

	@Then("^password entered$")
	public void password_entered(){
		WebElement pass=driver.findElement(By.xpath("//input[@id='Password']"));
		pass.sendKeys("Adhildev@123");
	}

	@Then("^user click on loginbutton$")
	public void user_click_on_loginbutton() {
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
		loginbutton.click();  
	}

	@Given("^User navigated to login page of demowebshop for invalid login$")
	public void user_navigated_to_login_page_of_demowebshop_for_invalid_login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\U48342\\Desktop\\Interview\\84\\chromedriver_win32 (2)\\chromedriver.exe\\");
		 driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com");
		 WebElement button=driver.findElement(By.xpath("//a[@class='ico-login']"));
	 	 button.click();
	}

	@Then("^please enter invalid email id$")
	public void please_enter_invalid_email_id() {
		WebElement mail=driver.findElement(By.xpath("//input[@id='Email']"));
		mail.sendKeys("gopika@gmail.com");
		
	}

	@Then("^Please enter valid password$")
	public void please_enter_valid_password() {
		WebElement pass=driver.findElement(By.xpath("//input[@id='Password']"));
		pass.sendKeys("Adhildev@123");
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button(){
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
		loginbutton.click(); 
		
		
	}

	@Given("^Launch to home page of demowebshop for another invalid login$")
	public void launch_to_home_page_of_demowebshop_for_another_invalid_login() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\U48342\\Desktop\\Interview\\84\\chromedriver_win32 (2)\\chromedriver.exe\\");
		 driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com");
		 WebElement button=driver.findElement(By.xpath("//a[@class='ico-login']"));
	 	 button.click();
	}

	@Then("^I should enter valid email$")
	public void i_should_enter_valid_email() {
		WebElement mail=driver.findElement(By.xpath("//input[@id='Email']"));
		mail.sendKeys("gopikacek14@gmail.com");
	}

	@Then("^User entered invalid password$")
	public void user_entered_invalid_password() {
		WebElement pass=driver.findElement(By.xpath("//input[@id='Password']"));
		pass.sendKeys("Adhildev");
		
	}

	@Then("^User should click on login button$")
	public void user_should_click_on_login_button() {
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
		loginbutton.click(); 
	}

	@Given("^please launch login page$")
	public void please_launch_login_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\U48342\\Desktop\\Interview\\84\\chromedriver_win32 (2)\\chromedriver.exe\\");
		 driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com");
		 WebElement button=driver.findElement(By.xpath("//a[@class='ico-login']"));
	 	 button.click();
		
	}

	@Then("^I should enter blank email$")
	public void i_should_enter_blank_email() {
		WebElement mail=driver.findElement(By.xpath("//input[@id='Email']"));
		mail.sendKeys("");
	}

	@Then("^I should enter blank password$")
	public void i_should_enter_blank_password() {
		WebElement pass=driver.findElement(By.xpath("//input[@id='Password']"));
		pass.sendKeys("");
	}

	@Then("^click on login button$")
	public void click_on_login_button() {
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
		loginbutton.click(); 
	}
}
