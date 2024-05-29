package orangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_step {
	
	@Given("I navigates to HRM")
	public void i_navigates_to_hrm() {
		System.out.println("I navigates to HRM");
		
	}

	@Given("I enter correct username and password")
	public void i_enter_correct_username_and_password() {
		System.out.println("I enter correct username and password");
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
		System.out.println("I click on submit button");
	}

	@Then("I logged out from HRM")
	public void i_logged_out_from_hrm() {
		System.out.println("I logged out from HRM");
	}
	

	@Given("I navigate to HRM")
	public void i_navigate_to_hrm() {
		System.out.println("I navigate to HRM");
	}
	

	@Then("I am on inside the home page")
	public void i_am_on_inside_the_home_page() {
		System.out.println("I am on inside the home page");
		
	}

	@Then("I validate the logout link")
	public void i_validate_the_logout_link() {
		System.out.println("I validate the logout link");
	}

}
