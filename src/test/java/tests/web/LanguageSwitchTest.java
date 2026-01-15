package tests.web;


import components.Languages;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.MainPage;


@Tag("web")
@DisplayName("Смена языка")
@Epic("Локализация")
@Feature("Смена языка")
public class LanguageSwitchTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @ParameterizedTest
    @Story("Смена языка на главной")
    @Severity(SeverityLevel.NORMAL)
    @Owner("allure8")
    @Description("Проверяем смену языка")
    @EnumSource(Languages.class)
    void checkLanguageSwitch(Languages lang) {

        mainPage.openPage()
                .switchLang()
                .chooseLang(lang)
                .checkLang(lang);

    }

}
