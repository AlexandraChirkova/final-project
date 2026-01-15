package tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Tag("web")
@DisplayName("Главная страница")
@Epic("Главная")
@Feature("Элементы главной")
public class MainPageTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("На главной странице есть меню")
    @Severity(SeverityLevel.NORMAL)
    @Owner("allure8")
    @AllureId("")
    @Description("Отображение меню на главной")
    void mainMenuShouldBeVisible() {
        mainPage.openPage()
                .checkMainMenuIsVisible();
    }

    @Test
    @DisplayName("Проверить наличие Каталог")
    @Severity(SeverityLevel.NORMAL)
    @Owner("allure8")
    @AllureId("")
    @Description("Отображение каталога на главной")
    void catalogShouldBeVisible() {
        mainPage.openPage()
                .checkCatalogButtonIsVisible();
    }

    @Test
    @DisplayName("На главной странице есть строка поиска")
    @Severity(SeverityLevel.NORMAL)
    @Owner("allure8")
    @AllureId("")
    @Description("Отображение строки поиска на главной")
    void searchFieldShouldBeVisible() {
        mainPage.openPage()
                .checkSearchFieldIsVisible();
    }

}
