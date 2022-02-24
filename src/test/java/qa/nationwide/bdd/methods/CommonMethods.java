package qa.nationwide.bdd.methods;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import qa.nationwide.bdd.setup.BaseClass;
import qa.nationwide.bdd.utilities.JavaLogger;

public class CommonMethods {

	public void actionHoverOver(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		try {
			BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
			actions.moveToElement(element).build().perform();
			JavaLogger.log("Hover Over performed on " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			JavaLogger.log("Element Not Found");
			Assert.fail();
		}
	}

	public void click(WebElement element) {
		try {
			element.click();
			JavaLogger.log(element + " clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			JavaLogger.log(element + " Element Not Found \n" + e.getLocalizedMessage());
			Assert.fail();
		}
	}

	public void selectDropDown(WebElement element, String value) {
		try {
			// BaseClass.waits.waitUntilSelectable(element);
			Select select = new Select(element);
			select.selectByValue(value);
			JavaLogger.log(value + " : has been selected for element, " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			JavaLogger.log(element + " Element Not Found \n" + e.getLocalizedMessage());
			Assert.fail();
		}
	}

	public void switchWindow() {
		List<String> windows = new ArrayList<String>(BaseClass.driver.getWindowHandles());
		BaseClass.driver.switchTo().window(windows.get(1));
	}

	public void scrollIntoViewTheElement(WebElement element) {
		try {
			BaseClass.jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			JavaLogger.log("Scrolling into element : " + element + ", Succeed");
		} catch (JavascriptException e) {
			e.printStackTrace();
			JavaLogger.log("Scrolling into element : " + element + ", Failed");
			Assert.fail();

		}

	}

}