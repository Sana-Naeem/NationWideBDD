package qa.nationwide.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.nationwide.bdd.setup.BaseClass;
import qa.nationwide.bdd.utilities.JavaLogger;

public class BusinessSteps extends BaseClass {

	@When("user clicks on the drop down menu bar in homepage")
	public void user_clicks_on_the_drop_down_menu_bar_in_homepage() {
		JavaLogger.log("This is a When Statement.");

	}

	@Then("a drop down menu with multiple categories will appear")
	public void a_drop_down_menu_with_multiple_categories_will_appear() {
		JavaLogger.log("This is a Then Statement.");

	}
}
