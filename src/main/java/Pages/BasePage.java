package Pages;

import org.openqa.selenium.By;
import Enum.WaitStrategy;
import org.openqa.selenium.WebElement;

import static Driver.DriverManager.getWebDriver;
import static FactoryClasses.ExplicitWaitFactory.performExplicitWait;

public class BasePage {

	protected static void click(By by, WaitStrategy waitStrategy) {

		WebElement element = performExplicitWait(by, waitStrategy);
		element.click();
	}

	protected static void sendKeys(By by, String text,  WaitStrategy waitStrategy) {

		WebElement element = performExplicitWait(by, waitStrategy);
		element.sendKeys(text);
	}

	protected static String getTitle() {

		return getWebDriver().getTitle();
	}

}
