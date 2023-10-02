package Pages;

import org.openqa.selenium.By;

import static Enum.WaitStrategy.CLICKABLE;
import static Enum.WaitStrategy.PRESENCE;

public final class OrangeHrmLoginPage extends BasePage {

	private static final By userNameField = By.cssSelector("input[name='username']");
	private static final By passwordField = By.cssSelector("input[name='password']");
	private static final By loginButton = By.cssSelector("button[data-v-10d463b7]");

	public OrangeHrmLoginPage enterUserName(String userName) {

		sendKeys(userNameField, userName, PRESENCE);

		return this;
	}

	public OrangeHrmLoginPage enterPassWord(String password) {

		sendKeys(passwordField, password, PRESENCE);

		return this;
	}

	public OrangeHRMHomePage clickLoginButton() {

		click(loginButton, CLICKABLE);

		return new OrangeHRMHomePage();
	}

	public static String getTitleOfLoginPage() {

		return getTitle();
	}
}