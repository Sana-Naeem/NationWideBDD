package qa.nationwide.bdd.steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.nationwide.bdd.setup.BaseClass;
import qa.nationwide.bdd.utilities.JavaLogger;

public class BusinessSteps extends BaseClass {
	
	@When("user clicks on the drop down menu bar they can select Business {string}")
	public void user_clicks_on_the_drop_down_menu_bar_they_can_select_business(String string) {
		mainPage_objects.dropDown(commonMethods, string);
	  
	}
	/*@When("user clicks on the drop down menu bar they can select Business")
	public void user_clicks_on_the_drop_down_menu_bar_they_can_select_business() {
		mainPage_objects.dropDownStep(commonMethods);
		JavaLogger.log("This is a When Statement.");

	}
	*/
	

	@Then("user will click on start your quote button")
	public void user_will_click_on_start_your_quote_button() {
		JavaLogger.log("This is a Then Statement.");

	}
	
}
