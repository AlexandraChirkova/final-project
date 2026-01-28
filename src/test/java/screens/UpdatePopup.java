package screens;

import com.codeborne.selenide.WebDriverRunner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class UpdatePopup {

    public void closeIfVisible() {
        try {
            AndroidDriver driver =
                    (AndroidDriver) WebDriverRunner.getWebDriver();

            driver.pressKey(new KeyEvent(AndroidKey.BACK));

        } catch (Exception e) {
            System.out.println("UpdatePopup ignored: " + e.getMessage());
        }
    }

}
