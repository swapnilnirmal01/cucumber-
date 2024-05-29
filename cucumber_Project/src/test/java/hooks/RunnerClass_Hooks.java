package hooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	
		dryRun=false,
		//Strict=true,
		monochrome=true,  
		features= {"/cucumber_Project/src/test/java/hooks/login_hooks.feature"},
		glue= {"hooks"}, 
	    plugin= {"pretty","html:target/cucumber-reports/reports.html","json:target/cucumber-reports/reports1.json"} ,
		tags="@validCredentials"
		)
        
public class RunnerClass_Hooks {
	
	

}
