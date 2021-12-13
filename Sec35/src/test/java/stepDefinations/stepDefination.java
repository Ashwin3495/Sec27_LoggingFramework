package stepDefinations;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


public class stepDefination {
	@Given("User is on Login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Lofin Page");
}
	@When("User login with usename {string} and password {string}")
	public void user_login_with_usename_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Username"+string);
		System.out.println("Username"+string2);

	}
	@Then("HomePage is loaded")
	public void home_page_is_loaded() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Homepage loades");
	}
	@Then("Centro HomePage is displayed {string}")
	public void centro_home_page_is_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Displayed"+string);
	}
		
	
	}


