package Constants;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class FrameWorkConstants {

	private static final String resourcesPath = System.getProperty("user.dir") + "/src/test/resources";
	//private static final String chromeDriverPath = resourcesPath + "/Executable/chromedriver.exe";
	private static final String configFilePath = resourcesPath + "/Config/ConfigProperties";
	private static final Duration explicitWait = Duration.ofSeconds(10);

	public static String getConfigFilePath() {

		return configFilePath;
	}

	public static Duration getExplicitWait() {

		return explicitWait;
	}
}
