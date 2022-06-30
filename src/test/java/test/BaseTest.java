package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utility.Constants;


public class BaseTest {

	WebDriver driver = null;
	
	@BeforeSuite
	public void initializer() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	}
	
	@BeforeMethod
	public void openBrowser() {
		driver.get(Constants.URL_FB);
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
