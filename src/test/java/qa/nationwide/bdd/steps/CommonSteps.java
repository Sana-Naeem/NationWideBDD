package qa.nationwide.bdd.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import qa.nationwide.bdd.setup.BaseClass;
import qa.nationwide.bdd.utilities.JavaLogger;

public class CommonSteps extends BaseClass{
	
	@Given("user is in the Libery Mutual Page")
	public void user_is_in_the_libery_mutual_page() {
		JavaLogger.log("This is a Given Statement.");
		BaseClass.initDriver();
		
	}
	
	@Given("the title of the page is {string}")
	public void the_title_of_the_page_is(String string) {
		String title = driver.getTitle();
	    JavaLogger.log("Title of the page is: " + title);
	    Assert.assertEquals(string, title);
	    
	}

}
