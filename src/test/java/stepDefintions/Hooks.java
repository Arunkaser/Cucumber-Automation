package stepDefintions;

import UI.DriverUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public static void setup(Scenario scenario) throws Exception {
		System.out.println(scenario.getName());
		DriverUtil.initiateWebDriver("firefox");
	}
	@After("@NegativeTest")
	public void beforeScenario(Scenario scenario) {
//		System.out.println("In hooks");
//		System.out.println(scenario.getName());
//		System.out.println(scenario.getStatus());
	}
}
