package Tests;

import org.testng.annotations.Test;

import static Driver.DriverManager.getWebDriver;
import static org.testng.AssertJUnit.assertEquals;

public class HomePageTest extends BaseTest {


	@Test
	public void homePageTest()
	{

		String title = getWebDriver().getTitle();

		assertEquals("OrangeHRM", title);
	}

	@Test
	public void homePageTestAgain()
	{

		String url = getWebDriver().getPageSource();
		url.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM");
	}
}
