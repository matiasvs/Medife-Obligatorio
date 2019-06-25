package Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/feature/"},
		glue = {"Steps"}, 
		monochrome = true, tags = {},
				plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" })

public class RunLogin {

}
