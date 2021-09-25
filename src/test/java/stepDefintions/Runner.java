package stepDefintions;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/cucumberHtmlReport"},
		//pretty:target/cucumber-json-report.json
		features = "src/test/resources/features/",
		glue = {"src/test/java/stepDefintions/"},
		tags={"@Login"}
)

public class Runner {
}
