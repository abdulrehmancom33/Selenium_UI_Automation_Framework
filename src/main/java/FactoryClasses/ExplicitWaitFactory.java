package FactoryClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Enum.WaitStrategy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Constants.FrameWorkConstants.getExplicitWait;
import static Driver.DriverManager.getWebDriver;
import static Enum.WaitStrategy.CLICKABLE;
import static Enum.WaitStrategy.PRESENCE;
import static Enum.WaitStrategy.VISIBLE;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ExplicitWaitFactory {

	private static WebDriverWait wait = new WebDriverWait(getWebDriver(), getExplicitWait());

	public static WebElement performExplicitWait(By by, WaitStrategy waitStrategy) {

		WebElement element = null;
		if (waitStrategy == CLICKABLE) {

			element = wait.until(elementToBeClickable(by));
		} else if (waitStrategy == PRESENCE) {

			element = wait.until(presenceOfElementLocated(by));

		} else if (waitStrategy == VISIBLE) {

			element = wait.until(visibilityOfElementLocated(by));

		}

		return element;
	}
}
