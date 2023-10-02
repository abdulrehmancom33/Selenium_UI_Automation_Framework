package Driver;

import Utils.PropertyUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

import static Driver.DriverManager.getWebDriver;
import static Driver.DriverManager.setDriver;
import static Driver.DriverManager.unload;

public class Driver {

	public static void initDriver() throws Throwable {

		if (Objects.isNull(getWebDriver())) {

			WebDriverManager.chromedriver().setup();
			setDriver(new ChromeDriver());
			getWebDriver().get(PropertyUtils.get("url"));
		}
	}

	public static void quitDriver() {

		if (Objects.nonNull(getWebDriver())) {
			getWebDriver().quit();
			unload();
		}
	}
}
