package qa.nationwide.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.nationwide.bdd.setup.BaseClass;
import qa.nationwide.bdd.utilities.JavaLogger;

public class BusinessSteps extends BaseClass {

	@When("user clicks on the drop down menu bar they can select Business {string}")
	public void user_clicks_on_the_drop_down_menu_bar_they_can_select_business(String string) {
		mainPage_objects.dropDown(commonMethods, string);
		JavaLogger.log("User click drop down");

	}
	/*
	 * @When("user clicks on the drop down menu bar they can select Business")
	 * public void user_clicks_on_the_drop_down_menu_bar_they_can_select_business()
	 * { mainPage_objects.dropDownStep(commonMethods);
	 * JavaLogger.log("This is a When Statement."); --->Second way to do }
	 */

	@Then("user will click on start your quote button")
	public void user_will_click_on_start_your_quote_button() {
		mainPage_objects.clickStartQuoteBtn.click();
		JavaLogger.log("User click start quote");

	}

	@Then("user will be navigated to another page")
	public void user_will_be_navigated_to_another_page() {
		BaseClass.commonMethods.switchWindow();
		JavaLogger.log("User will be swicthes to another window");

	}

	@Then("user will then click on the second start your quote button")
	public void user_will_then_click_on_the_second_start_your_quote_button() {
		mainPage_objects.secondStartQuoteBtn.click();
		JavaLogger.log("User will click start quote again");
	}

	@Then("user will scroll down to Workers compensation and can click on the select this coverage button")
	public void user_will_scroll_down_to_workers_compensation_and_can_click_on_the_select_this_coverage_button() {
		mainPage_objects.scrolling(commonMethods);
		mainPage_objects.findCoverageBtn.click();
		JavaLogger.log("User will scroll and click find coverage");

	}

	@Then("user will go to next step by clicking save and continue button")
	public void user_will_go_to_next_step_by_clicking_save_and_continue_button() {
		mainPage_objects.scrolling1(commonMethods);
		mainPage_objects.saveContinueBtn.click();
		JavaLogger.log("User will click save and continue");

	}
}
