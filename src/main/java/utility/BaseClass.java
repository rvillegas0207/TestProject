package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeSuite
	public static void initializer() {
		System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_LOC);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public static void openBrowser() {
		driver.get(Constants.URL_FB);
	}
	
	@AfterSuite
	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}

	public static void log(String message, Object data) {
		System.out.println(String.format(message, data));
	}
	
	public static void log(String message) {
		System.out.println(message);
	}
	
	public static WebDriverWait await(Integer timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
		return wait;
	}
	
	public static String getPageTitle() {
		return driver.getTitle();
	}
	
	public static String switchToFrame() {
		return	switchToFrame();
	}
}
