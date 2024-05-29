package cucumber_expression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTube_expression_cucumber {

	WebDriver d;
	
	@Given("user opening ninja url")
	public void open_ninja_url() {
		
		WebDriverManager.chromedriver().setup();
		 d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://tutorialsninja.com/demo/");
		System.out.println(" user opening ninja url ");
	}
	
    @And("search for my account link")
    public void my_account_link() {
    	
   
    	System.out.println(" search for my account link ");
    }
    
    @And("search for login link")
    public void login_link() {
    	System.out.println(" search for login link ");
    }
    
    @When("submit username and password")
    public void submit_username_password() {
    	System.out.println(" submit username and password ");
    }
    
    @And("submit login button")
    public void submit_login_button() {
    	System.out.println(" submit login button ");
    }
    
    @Then("enter on ninja home page")
    public void ninja_home_page() {
    	System.out.println(" enter on ninja home page ");
    }
}
