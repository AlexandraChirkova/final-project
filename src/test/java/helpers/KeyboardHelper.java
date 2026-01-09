package helpers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class KeyboardHelper {

    public static void hideKeyboard() {
        WebDriver driver = getWebDriver();

        if (driver instanceof AndroidDriver) {
            try {
                ((AndroidDriver) driver).hideKeyboard();
            } catch (Exception ignored) {
            }
        }
    }
}
