package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven_step {

	WebDriver d = null;

	@Given("I open browser")
	public void i_open_browser() {

		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
		d.get("https://tutorialsninja.com/demo/index.php?route=common/home");


		System.out.println("I open browser");
	}

	@And("User click on My Account link")
	public void User_click_on_My_Account_link() {

		WebElement myaccount_btn = d.findElement(By.linkText("My Account"));
		myaccount_btn.click();


		System.out.println("user click on My Account link");

	}

	@Given("User is on login page")
	public void user_is_on_login_page() {

		WebElement login_btn = d.findElement(By.linkText("Login"));
		login_btn.click();

		System.out.println("User is on login page");
	}

	@When("^User enter valid (.*) and (.*)$")
	public void user_enter_valid_username_and_password(String username,String password) {

		WebElement username1 = d.findElement(By.xpath("//input[@id='input-email']"));
		username1.sendKeys(username);

		WebElement password1 = d.findElement(By.xpath("//input[@id='input-password']"));
		password1.sendKeys(password);

		System.out.println("User enter valid username and password");

	}

	@When("User click on login button")
	public void user_click_on_login_page() {

		WebElement login = d.findElement(By.xpath("//input[@class='btn btn-primary']"));
		login.click();


		System.out.println("User click on login button");
	}

	@Then("User navigate to Home page")
	public void user_navigate_to_home_page() {

		d.getPageSource().contains("My Orders");

		System.out.println("User navigate to Home page");

		d.close();
		d.quit();

	}


}
