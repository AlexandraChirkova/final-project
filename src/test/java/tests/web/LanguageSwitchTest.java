package tests.web;


import components.Languages;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.MainPage;


@Tag("web")
@DisplayName("Смена языка")
public class LanguageSwitchTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @ParameterizedTest
    @EnumSource(Languages.class)
    void checkLanguageSwitch(Languages lang) {

        mainPage.openPage()
                .switchLang()
                .chooseLang(lang)
                .checkLang(lang);

    }

}
