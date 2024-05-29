package login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_step {
	
	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page() {
		System.out.println("User navigates to Login Page");
	}
	
	@Given("check for landing on login page or not")
	public void check_for_landing_on_login_page_or_not() {
		System.out.println("check for landing on login page or not");
	}

	@When("User enter valid username")
	public void user_enter_valid_username() {
		System.out.println("User enter valid username");
	}

	@When("Enter valid Password")
	public void enter_valid_password() {
		System.out.println("Enter valid Password");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("click on login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println("User should login successfully");
	}

	@Given("User Navigates to Login Page")
	public void user_navigates_to_login_pages() {
		
		System.out.println("User Navigates to Login Page");
		
	}

	@When("User enter invalid username")
	public void user_enter_invalid_username() {
		System.out.println("User enter invalid username");
	}

	@When("User enter invalid password")
	public void user_enter_invalid_password() {
		System.out.println("User enter invalid password");
		
	}

	@When("click on Login button")
	public void click_on_loginbutton() {
		System.out.println("click on Login button");
	}

	@Given("User Navigate to Login Page")
	public void navigate_to_login_page() {
		System.out.println("User Navigate to Login Page");
	}

	@Then("User should get proper warning message")
	public void user_should_get_proper_warning_message() {
		System.out.println("User should get proper warning message");
	}

	@Given("User navigate to Login page")
	public void user_navigate_to_login_page() {
		System.out.println("User navigate to Login page");
	}

	@When("User enter valid password")
	public void user_enter_valid_password() {
		System.out.println("User enter valid password");
	}

	@When("User click on Login Button")
	public void user_click_on_login_button() {
		System.out.println("User click on Login Button");
	}

	@Then("User get Proper warning message")
	public void user_get_proper_warning_message() {
		System.out.println("User get Proper warning message");
	}

}
