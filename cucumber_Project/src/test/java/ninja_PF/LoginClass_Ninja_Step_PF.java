package ninja_PF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginClass_Ninja_Step_PF {
	
	WebDriver d;
	LoginCLass_PF loginclasspf;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		d.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		 loginclasspf = new LoginCLass_PF(d);
		System.out.println("----user is on login page");
	}

	@And("user click on my account button")
	public void user_click_on_my_account_button() {
		loginclasspf.myaccount();
		System.out.println("---click on my account button");
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		loginclasspf.loginlink();
		System.out.println("---click on login clcik under my account");	
	}

	@When("^enter (.*) and (.*)$")
	public void enter_username_password(String username, String password) {
		loginclasspf.username(username);	
		loginclasspf.password(password);
		System.out.println("---send username and password");
	}

	@And("click on logout button")
	public void click_on_logout_button() {
		loginclasspf.logout();
		System.out.println("---click on logout button");
		
	}

	@Then("validate user is on login page")
	public void validate_user_is_on_login_page() {
		
		System.out.println("--user is on login page");
	}

}
