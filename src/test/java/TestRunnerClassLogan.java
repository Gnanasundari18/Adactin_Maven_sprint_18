import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SIVA\\eclipse-workspace\\Day1cumer\\src\\test\\resources\\featureFolder2",glue = "org.stepdefinition3", dryRun= false,monochrome=true)
public class TestRunnerClassLogan {

}
