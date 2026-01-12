package config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.util.Map;

public class WebDriverProvider {

    public static void apply(WebConfig cfg) {

        if ("chrome".equals(cfg.browser())) {
            WebDriverManager.chromedriver().setup();
        }

        Configuration.baseUrl = cfg.baseUrl();
        Configuration.browser = cfg.browser();
        Configuration.browserVersion = cfg.browserVersion();
        Configuration.browserSize = cfg.browserSize();
        Configuration.pageLoadStrategy = cfg.pageLoadStrategy();
        Configuration.reopenBrowserOnFail = cfg.reopenBrowserOnFail();

        String remoteUrl = cfg.remote().trim();
        if (!remoteUrl.isEmpty()) {
            Configuration.remote = remoteUrl;

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", cfg.enableVNC(),
                    "enableVideo", cfg.enableVideo()
            ));
            Configuration.browserCapabilities = capabilities;
        }
    }
}
