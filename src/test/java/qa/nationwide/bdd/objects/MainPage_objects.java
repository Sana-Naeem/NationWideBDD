package qa.nationwide.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.nationwide.bdd.methods.CommonMethods;
import qa.nationwide.bdd.setup.BaseClass;

public class MainPage_objects {

	public MainPage_objects(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	@FindBy (xpath = "//select[@id='customSelectQuote']")
	public WebElement quoteDropDown;
	@FindBy (xpath = "//input[@class='myButton button nw-button--blue-light custom-quote-submit']")
	public WebElement clickStartQuoteBtn;
	
	//public void dropDownStep(CommonMethods cm) {
	//	cm.selectDropDown(quoteDropDown, "Business");
	//	BaseClass.commonMethods.selectDropDown(quoteDropDown, dropDown);
	//}
	public void dropDown(CommonMethods cm, String value) {
		cm.selectDropDown(quoteDropDown, value);
	}
	
}

	