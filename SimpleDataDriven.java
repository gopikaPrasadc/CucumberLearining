package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SimpleDataDriven {
	
		WebDriver driver;
		@Given("^I should launch application$")
	    public void i_should_launch_application()  {
			 System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		 		driver = new ChromeDriver();
		 		driver.manage().window().maximize();
		 		driver.get("http://demo.guru99.com/test/newtours");
	       
	    }

	    @Then("^I should enter username \"([^\"]*)\"$")
	    public void i_should_enter_username(String uname)  {
	    	WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
		  	  user.sendKeys(uname);
	        
	    }

	    	@And("^I should enter password \"([^\"]*)\"$")
	    	public void i_should_enter_password(String password)  {
	    	   
	    		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
			  	  pass.sendKeys(password);
	    	}
	    
		
	    @Then("^I should select the submit button$")
	    public void i_should_select_the_submit_button()  {
	    	WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
	    	submit.click();
	    	driver.close();
	    	
	        
	    }

	}


