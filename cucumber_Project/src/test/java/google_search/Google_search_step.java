package google_search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Google_search_step {
	
	WebDriver d=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//d.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		System.out.println("inside browser is open ");
		
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page()  {
		
		d.get("https://www.google.com");
		System.out.println("== user is on google search");
		
		System.out.println("click on staysignout button ");    
	//	d.switchTo().frame("callout");
	//	d.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
		
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
		//d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement search_txt =d.findElement(By.name("q"));
		search_txt.sendKeys("selenium automatiom");
		System.out.println("=user enter text in search ");
		
	}

	@When("hits enter")
	public void hits_enter() {
		
		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(" user enter -hits enter");
		
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		
		d.getPageSource().contains("Selenium Automation Testing Tool");
		
		System.out.println("user navigate to search results");
		
		d.close();
		d.quit();	
	}

}
