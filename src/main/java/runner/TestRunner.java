package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/Chetanpreet/eclipse-workspace/freecrmBDDFrmwrk/src/main/java/feature/login.feature"
		,glue= {"stepDefinitions"},
		format= {"pretty","html:test-outout","json:"},
		monochrome=true, //display the console output in proper readable format
		dryRun = false
		)

public class TestRunner {

}
