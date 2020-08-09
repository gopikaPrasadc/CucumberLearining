package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginstepDefinition {
	WebDriver driver;
	
	 @Given("^launch the site$")
	    public void launch_the_site()  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\U48342\\Desktop\\Interview\\84\\chromedriver_win32 (2)\\chromedriver.exe\\");
			driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");

	    }

	
	@Then("^click on login button$")
    public void click_on_login_button()  {
		WebElement loginlink = driver.findElement(By.xpath("//*[@class='ico-login']"));  
		loginlink.click();
    }

    @Then("^enter username$")
    public void enter_username() {
    	WebElement username = driver.findElement(By.xpath("//*[@id='Email']"));
		username.sendKeys("gopikacek14@gmail.com");
    }
    @Then("^enter password$")
    public void enter_password() {
    	
    	WebElement password = driver.findElement(By.xpath("//*[@id='Password']"));
		password.sendKeys("Adhildev@123");
    }

    @Then("^user successfully login$")
    public void user_successfully_login() {
    	WebElement loginbutton = driver.findElement(By.xpath("//*[@type='submit'and @value='Log in']"));
		loginbutton.click();
		driver.close();
    }

}
