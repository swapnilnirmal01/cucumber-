package ninja_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ninja_login_step_POM {

	WebDriver d ;
	Login_class_pom loginclass ;

	@Given("click on my account link")
	public void click_on_my_account_link() {

		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		d.get("https://tutorialsninja.com/demo/index.php?route=common/home");
         
		loginclass= new Login_class_pom(d);
		loginclass.my_Account();
		System.out.println("click on my account link");
	}

	@Given("user click on login button to enter in login page")
	public void user_click_on_login_button_to_enter_in_login_page() {
		loginclass.login_btn();
		System.out.println("user click on login button to enter in login page");
	}

	@Given("user enter on login page")
	public void user_enter_on_login_page() {
		System.out.println("user enter on login page");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username ,String password) {

		loginclass.enterUserName(username);
		loginclass.enterpassword(password);
		System.out.println("user enter username and password");	
	}

	@When("user click on login page to enter on home page")
	public void user_click_on_login_page_to_enter_on_home_page() {
		loginclass.clcik_login();	
		System.out.println("user click on login page to enter on home page");	
	}

	@Then("validat the user on home page")
	public void validat_the_user_on_home_page() {
		loginclass.logout_btn_ninja();
		System.out.println("validat the user on home page");
		d.close();
		d.quit();
	}


}
