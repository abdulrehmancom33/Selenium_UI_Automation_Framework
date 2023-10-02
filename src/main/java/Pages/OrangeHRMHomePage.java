package Pages;

import org.openqa.selenium.By;
import static Enum.WaitStrategy.CLICKABLE;
import static org.openqa.selenium.By.cssSelector;

public class OrangeHRMHomePage extends BasePage{

	private final By dropDownBtn = cssSelector("i.oxd-userdropdown-icon");
	private final By logOutOption = cssSelector(
			"ul[data-v-f0c5131f] li[data-v-f0c5131f] a.oxd-userdropdown-link[href='/web/index.php/auth/logout']");

	public OrangeHrmLoginPage clickLogOut() {

		click(dropDownBtn, CLICKABLE);
		click(logOutOption, CLICKABLE);

		return new OrangeHrmLoginPage();
	}
}