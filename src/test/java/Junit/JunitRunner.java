package Junit;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue={ "StepDefinition" }, dryRun=false)

public class JunitRunner {
	
	}
