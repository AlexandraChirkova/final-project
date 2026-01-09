package tests.web;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebConfig;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {

    @BeforeAll
    static void setupConfig() {
        WebConfig cfg = ConfigFactory.create(WebConfig.class, System.getProperties());
        WebDriverProvider.apply(cfg);
        System.out.println("runMode=" + System.getProperty("runMode"));
        System.out.println("cfg.remote=" + cfg.remote());
        System.out.println("Selenide Configuration.remote=" + com.codeborne.selenide.Configuration.remote);

    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        Selenide.closeWebDriver();
    }

}
