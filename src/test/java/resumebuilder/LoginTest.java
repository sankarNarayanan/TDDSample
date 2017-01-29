package resumebuilder;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	String response = "";

	@Given("^I am on the login screen$")
	public void verifyLoginScreen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AuthenticateUser loginUser = new AuthenticateUser();
		Boolean result = loginUser.userInLoginScreen();
		if(result){
			Assert.assertTrue(true);
		}else{
			Assert.assertFalse("User Not in Login Screen", true);
		}
	    //throw new PendingException();
	}
	
	@When("^I login with the credentials of \"([^\"]*)\" and \"([^\"]*)\" and click login$")
	public void authenticateWithCredentails(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AuthenticateUser loginUser = new AuthenticateUser();
		this.response = loginUser.authenticate(arg1);
		//throw new PendingException();
	}

	@Then("^I get response as \"([^\"]*)\"$")
	public void i_get_response_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions			
		if (this.response.equalsIgnoreCase(arg1)){
			Assert.assertTrue(response, true);
		}else{
			Assert.assertFalse(response, true);
		}
		//throw new PendingException();
	}
	
	
	@When("^I login with the credentials of \"([^\"]*)\" and \"([^\"]*)\" and click cancel$")
	public void i_login_with_the_credentials_of_and_and_click_cancel(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(true);
	}

	@Then("^I get response as nothing$")
	public void i_get_response_as_nothing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	}

	
}
