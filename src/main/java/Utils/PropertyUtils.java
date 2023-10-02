package Utils;

import java.io.FileInputStream;
import static Constants.FrameWorkConstants.getConfigFilePath;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import Enum.ConfigProperties;

public class PropertyUtils {

	private static Map<String, String> configMap = new HashMap<>();

	private PropertyUtils() {
	}

	private static final Properties property = new Properties();

	static {
		try{
		FileInputStream file = new FileInputStream(getConfigFilePath());
		property.load(file);
		property.entrySet().forEach( entry -> configMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
	} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static String get(String key) throws Throwable {

		if(Objects.isNull(key) || Objects.isNull(configMap.get(key)))
		{
			throw new Exception("property name" + key + "is not found");
		}

		return configMap.get(key);
	}
}
