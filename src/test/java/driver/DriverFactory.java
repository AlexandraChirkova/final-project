package driver;

import com.codeborne.selenide.WebDriverProvider;

public class DriverFactory {

    public static WebDriverProvider getDriver() {

        String deviceHost =
                System.getProperty("deviceHost", "emulation");

        return switch (deviceHost) {
            case "browserstack" -> new BrowserstackDriver();
            case "real" -> new LocalDriver();
            case "emulation" -> new EmulationDriver();
            default -> throw new IllegalArgumentException(
                    "Unknown deviceHost: " + deviceHost);
        };
    }
}


