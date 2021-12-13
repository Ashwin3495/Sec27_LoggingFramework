package stepDefinations;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;

import HomePage_Cucumber.HomePage;
import HomePage_Cucumber.LoginPage;
import Resources_Cucumber.base;


public class stepDefination extends base {
		

@Given("Initialize the browser")
public void initialize_the_browser() throws IOException {
	driver=initializeDriver();
	
}

@And("^Navigate to \"([^\"]*)\" site$")
public void navigate_to_something_site(String strArg1) throws Throwable {
    driver.get(strArg1);
}
	

@Given("Click on Login link in home page to land on Secure sign in Page")
public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
	HomePage hp=new HomePage(driver);
	if(hp.popupsize().size()>0)
	{
		hp.popup().click();
	}
	hp.login();
	
}


@Then("Verify the HomePage")
public void verify_the_home_page() {
	
	
}

@When("^User login with (.+) and (.+)$")
public void user_login_with_and(String username, String password) throws Throwable {

	LoginPage lp=new LoginPage(driver);
	lp.getemail().sendKeys(username);
	lp.getpass().sendKeys(password);
	lp.getSignin().click();
	
}
	}


