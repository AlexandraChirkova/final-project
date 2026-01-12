package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Tag("web")
@DisplayName("Главная страница")
public class MainPageTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("На главной странице есть меню")
    void mainMenuShouldBeVisible() {
        mainPage.openPage()
                .checkMainMenuIsVisible();
    }

    @Test
    @DisplayName("Проверить наличие Каталог")
    void catalogShouldBeVisible() {
        mainPage.openPage()
                .checkCatalogButtonIsVisible();
    }

    @Test
    @DisplayName("На главной странице есть строка поиска")
    void searchFieldShouldBeVisible() {
        mainPage.openPage()
                .checkSearchFieldIsVisible();
    }

}
