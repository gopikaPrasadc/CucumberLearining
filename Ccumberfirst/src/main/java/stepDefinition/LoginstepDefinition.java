package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginstepDefinition {
	WebDriver driver;

	@Given("^THe user should launch the browser$")
	public void the_user_should_launch_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\U48342\\Desktop\\Interview\\84\\chromedriver_win32 (2)\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");

		throw new PendingException();
	}

	@Then("^ I have to verify the page title$")
	public void i_have_to_verify_the_page_title() throws Throwable {
		driver.getTitle();
		WebElement title = driver.findElement(By.xpath("//*[text()='Welcome, Please Sign In!']"));
		Assert.assertEquals(title.getText(), "Welcome, Please Sign In!");
		throw new PendingException();
	}

	@Then("^ user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		WebElement username = driver.findElement(By.xpath("//*[@id='Email']"));
		username.sendKeys("gopikacek14@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id='Password']"));
		password.sendKeys("Adhildev@123");
		throw new PendingException();
	}

	@And("^user should be able to click on the login button$")
	public void user_should_be_able_to_click_on_the_login_button() throws Throwable {
		WebElement loginbutton = driver.findElement(By.xpath("//*[@type='submit'and @value='Log in']"));
		loginbutton.click();
		throw new PendingException();
	}
}
