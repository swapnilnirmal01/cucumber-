package tags_cucumber;

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

public class Automation_step {
	
	WebDriver d;
	
	public void lauchbrowser() {
		
	WebDriverManager.chromedriver().setup();
	d= new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	d.get("https://automationstepbystep.com/");
	
	}
	
    @Given("Navigate to automation step by step site")
    public void Navigate_to_site() {
    	d.get("https://automationstepbystep.com/");
    	System.out.println("---Navigate to automation step by step site");
    }
    
    @And("clicking on selenium")
    public void clicking_selenium() {
    	d.getPageSource().contains("NEVER STOP LEARNING");
        //d.findElement(null)
    	//d.findElement(By.linkText("selenium"));
    	System.out.println("---clicking on selenium");
    }
    
    @And("user click on selenium introduction")
    public void click_selenium_introduction() {
    	WebElement sel_indro =d.findElement(By.linkText("Selenium Introduction"));
    	sel_indro.click();
    	System.out.println("---user click on selenium introduction");
    }
    
    @When("searching for API testing")
    public void searching_API_testing() {
    	WebElement search_txt = d.findElement(By.xpath("//input[@name='s']"));
    	search_txt.sendKeys("API testing");
    	WebElement enter = d.findElement(By.xpath("//input[@type='submit'][1]"));
    	enter.click();    	
    	System.out.println("--searching for API testing");
    }
    
    @And("validate user is on search results page")
    public void validate_on_search_results_page() {
    	d.getPageSource().contains("Search results for «api testing»");
    	System.out.println("validate user is on search results page");
    }
    
    @Then("user navigate to home page by clicking on home buttom")
    public void navigate_home_clicking_home_button() {
       WebElement home_btn = d.findElement(By.linkText("Home"));
       home_btn.click();
    	System.out.println("user navigate to home page by clicking on home buttom");
    }
    
    
}
