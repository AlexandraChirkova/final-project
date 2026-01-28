package screens;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.androidUIAutomator;

public class UpdatePopup {

    private final SelenideElement remindLaterButton =
            $(androidUIAutomator(
                    "new UiSelector().textContains(\"НАПОМНИТЬ\")"
            ));

    public void closeIfVisible() {
        if (remindLaterButton.is(visible)) {
            remindLaterButton.click();
        }
    }
}
