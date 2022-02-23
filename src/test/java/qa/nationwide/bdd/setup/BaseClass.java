package qa.nationwide.bdd.setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import qa.nationwide.bdd.methods.CommonMethods;
import qa.nationwide.bdd.objects.MainPage_objects;
public class BaseClass{
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static CommonMethods commonMethods;
	public static MainPage_objects mainPage_objects;
	
	public static void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.nationwide.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		initClasses();
	}
	
	private static void initClasses() {
		commonMethods = new CommonMethods();
		mainPage_objects = new MainPage_objects(driver);
	}
}
