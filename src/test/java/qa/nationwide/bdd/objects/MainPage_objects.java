package qa.nationwide.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage_objects {

	public MainPage_objects(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	@FindBy (xpath = "//select[@id='customSelectQuote']")
	public WebElement quoteDropDown;
	@FindBy (xpath = "//input[@class='myButton button nw-button--blue-light custom-quote-submit']")
	public WebElement clickStartQuoteBtn;
}

	