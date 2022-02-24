package qa.nationwide.bdd.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.nationwide.bdd.setup.BaseClass;
import qa.nationwide.bdd.utilities.JavaLogger;

public class HooksClass extends BaseClass {

	@Before
	public void initiating() {
		JavaLogger.log("Initiating BDD Tests");
	}

	@After
	public void tearup() {
		// BaseClass.driver.quit();
	}
}
