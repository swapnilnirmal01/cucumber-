package login;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		dryRun=false,
		//Strict=true,
		monochrome=true,  // output format no square bracket coming in o/p
		features= {"/cucumber_Project/src/test/java/login/login.feature"}, // feature file path 
		glue= {"login"}, // package name in glue 
		plugin= {"pretty","html.target/size/cucumber.html","json.target/cucumber1/json"}, // report generate like testNG
		tags="@validcredentials"
		
		)
        

public class Runner_Login {
	
	

}
