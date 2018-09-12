package stepDefinitions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {
		
		 System.setProperty("webdriver.chrome.driver", "/Users/Chetanpreet/Downloads/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.freecrm.com");
		 
		
		
	}
	@When("^title of login page is Free CRM$")
	public void tite_Login_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}

	@Given("^user enters password$")
	public void user_enters_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters password");
	}

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on Home Page");
	}
	
	@Then("^user enters username$")
	public void user_enters_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is entering username");
	}

}

