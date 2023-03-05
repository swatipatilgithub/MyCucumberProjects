package starter.stepdefinitions;

import businessLib.businessLib;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Login_Stepdefinition {

	@Steps
	businessLib bl;
	@Given("launch browser")
	public void launch_browser() {
	    bl.launchbrowser();
	}

	@When("user enter name {string}")
	public void user_enter_name(String Name) {
	    bl.enterName(Name);
	}

	@When("user enter email {string}")
	public void user_enter_email(String Email) {
	   bl.Email(Email);
	}
	
	@When("user enter currentaddress {string}")
	public void user_enter_currentaddress(String CurrentAddress) {
	    bl.Currentaddress(CurrentAddress);
	}
	
	@When("user enter permanentaddress {string}")
	public void user_enter_permanentaddress(String PermanentAddress) {
	    bl.PermanentAddress(PermanentAddress);
	}
	
	@When("user click on submit button")
	public void user_click_on_submit_button() {
	    bl.submit();
	}

    @Then("user submission successfully")
	public void user_submission_successfully() {
	   
	}      
}

