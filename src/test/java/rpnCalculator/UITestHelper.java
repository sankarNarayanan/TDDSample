package rpnCalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UITestHelper {

	WebDriver driver = new FirefoxDriver();
	String baseUrl = "http://localhost:8081/resumebuilder/login";
	
	@Given("^I am on the Welcome screen and enter expression \"([^\"]*)\"$")
	public void i_am_on_the_Welcome_screen_and_enter_expression(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.get(baseUrl);
		
		//throw new PendingException();
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I get the desired result$")
	public void i_get_the_desired_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
}
