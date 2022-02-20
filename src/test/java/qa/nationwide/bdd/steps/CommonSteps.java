package qa.nationwide.bdd.steps;

import io.cucumber.java.en.Given;
import qa.nationwide.bdd.setup.BaseClass;
import qa.nationwide.bdd.utilities.JavaLogger;

public class CommonSteps extends BaseClass{
	
	@Given("user is in the Libery Mutual Page")
	public void user_is_in_the_libery_mutual_page() {
		JavaLogger.log("This is a Given Statement.");
		BaseClass.initDriver();
		
	}

}
