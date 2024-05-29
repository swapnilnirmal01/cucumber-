package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Step_Hooks {

	WebDriver d ;

	@Before    // run for every scenario
	public void browsersetup() {

		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		d.manage().window().maximize();
		System.out.println("i am inside browser set up ");
	}

	@After
	public void teardown() {
		System.out.println("i am inside tear down ");
		d.close();
		d.quit();
	}
	@BeforeStep
	public void beforestep() {
		System.out.println(" i inside before step");
	}

	@AfterStep
	public void afterstep() {
		System.out.println(" i am inside after step");

	}

	@Given("^user is on login page*")
	public void yser_is_on_login_page() {

		System.out.println("---on login page");
	}

	@And("user enter valid username")
	public void user_enter_valid_username() {
		System.out.println("---enter valid username");

	}

	@And("user enter password")
	public void user_enter_password() {

		System.out.println("---enter valid password");
	}

	@When("user click on login button")
	public void click_login() {

		System.out.println("---click on login button");
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
		System.out.println("---navigate to home page");

	}

	
	@And("user enter Invalid username")
	public void enter_invalid_username() {
		System.out.println("enter invalid username");
	}

	@And("user enter invalid password")
	public void enter_password() {
		System.out.println("user enter password");
	}


	@Then("user get eeror message")
	public void get_error_message() {
		System.out.println("user get error message");
	}

	@But("user do not naviagte to home page")
	public void do_not_navigate_home_page() {
		System.out.println("user do not naviagte to home page");
	}


}
