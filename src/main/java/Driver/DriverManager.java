package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverManager {

	private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

	public static WebDriver getWebDriver() {

		return driverThreadLocal.get();
	}

	public static void setDriver(WebDriver driverRef) {

		driverThreadLocal.set(driverRef);
	}

	public static void unload() {
		WebDriver driver = driverThreadLocal.get();
		if (driver != null) {
			driver.quit();
			driverThreadLocal.remove();
		}
	}
}

