package driver;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserstackConfig;
import helpers.BrowserstackAppUploader;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;


public class BrowserstackDriver implements WebDriverProvider {
    private final BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities ignored) {

        MutableCapabilities caps = new MutableCapabilities();
        MutableCapabilities bstackOptions = new MutableCapabilities();

        bstackOptions.setCapability("userName", config.bsUser());
        bstackOptions.setCapability("accessKey", config.bsKey());

        caps.setCapability("platformName", config.platformName());
        caps.setCapability("appium:deviceName", config.androidDevice());
        caps.setCapability("appium:platformVersion", config.androidOsVersion());
        caps.setCapability("appium:automationName", config.automationName());

        String appValue = config.androidApp();
        String app;

        if (appValue.startsWith("bs://")) {
            app = appValue;
        } else {
            app = BrowserstackAppUploader.upload(
                    config.bsUser(),
                    config.bsKey(),
                    appValue
            );
        }

        caps.setCapability("appium:app", app);
        caps.setCapability("bstack:options", bstackOptions);

        try {
            return new RemoteWebDriver(
                    new URL(config.bsHub()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

