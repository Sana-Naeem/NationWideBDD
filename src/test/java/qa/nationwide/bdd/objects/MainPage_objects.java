package qa.nationwide.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.nationwide.bdd.methods.CommonMethods;

public class MainPage_objects {

	public MainPage_objects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='customSelectQuote']")
	public WebElement quoteDropDown;
	@FindBy(xpath = "//input[@class='myButton button nw-button--blue-light custom-quote-submit']")
	public WebElement clickStartQuoteBtn;
	@FindBy(xpath = "//button[@class='button hollow nw-button--hollow-white bold-penguin-quote']")
	public WebElement secondStartQuoteBtn;
	@FindBy(xpath = "//button[@data-test-id='coverage-button-bop']")
	public WebElement findCoverageBtn;
	@FindBy(xpath = "//span[@class='submit-button-text ng-star-inserted']")
	public WebElement saveContinueBtn;

	// public void dropDownStep(CommonMethods cm) {
	// cm.selectDropDown(quoteDropDown, "Business");
	// BaseClass.commonMethods.selectDropDown(quoteDropDown, dropDown);
	// }--->Second way to do

	public void dropDown(CommonMethods cm, String value) {
		cm.selectDropDown(quoteDropDown, value);
	}

	public void scrolling(CommonMethods cm) {
		cm.scrollIntoViewTheElement(findCoverageBtn);
	}

	public void scrolling1(CommonMethods cm) {
		cm.scrollIntoViewTheElement(saveContinueBtn);
	}

}
