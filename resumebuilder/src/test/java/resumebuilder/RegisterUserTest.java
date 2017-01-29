package resumebuilder;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterUserTest {
	
	RegisterUser registerUser = new RegisterUser();

	@Given("^I am on the sign up screen$")
	public void i_am_on_the_sign_up_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		// Write code here that turns the phrase above into concrete actions
		Boolean result = this.registerUser.userInRegisterScreen();
		if(result){
			Assert.assertTrue(true);
		}else{
			Assert.assertFalse("User Not in Register Screen", true);
		}
		
	}

	@When("^I enter email Id and name as \"([^\"]*)\" and \"([^\"]*)\" and click on register$")
	public void i_enter_email_Id_and_name_as_and_and_click_on_register(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Boolean result = this.registerUser.registerUser(arg1, arg2);
		if(result){
			Assert.assertTrue(true);
		}else{
			Assert.assertFalse("User Not Present", true);
		}
	}

	
	@Then("^I get alert as \"([^\"]*)\"$")
	public void i_get_alert_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String response = this.registerUser.getResponse();
		if (response.equalsIgnoreCase(arg1)){
			Assert.assertTrue(true);
		}
		
	}
	
}
