package Tests;

import Driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static Driver.Driver.initDriver;
import static Driver.Driver.quitDriver;


public class BaseTest {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	@BeforeMethod
	protected void setup() throws Throwable {

		initDriver();
	}

	@AfterMethod
	protected void tearDown() {

		quitDriver();
	}
}
