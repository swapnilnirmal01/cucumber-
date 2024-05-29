package learningSports_regularExpression;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		dryRun=false,
		monochrome=true,  // output format no square bracket coming in o/p
		features= {"/cucumber_Project/src/test/java/learning.feature"}, // feature file path 
		glue= {"learningSports_regularExpression"}, // package name in glue 
		plugin= {"pretty","html:target/size/cucumber.html"}, // report generate like testNG
		tags= "@Looking"

		)
// "json:target/cucumber/report.json"},

public class Runner_learning {

}
