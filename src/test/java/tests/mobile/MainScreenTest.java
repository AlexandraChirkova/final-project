package tests.mobile;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import screens.MainScreen;

@Tag("mobile")
@DisplayName("Главная страница")
@Epic("Мобильная версия")
@Feature("Элементы главного экрана")
public class MainScreenTest extends MobileBaseTest{

    MainScreen mainScreen = new MainScreen();

    @Test
    @DisplayName("На главной странице отображается строка поиска")
    void searchBarShouldBeVisible() {

        mainScreen
                .shouldSeeSearchBar();
    }

    @Test
    @DisplayName("На главной странице отображаются иконки меню")
    void menuIconsShouldBeVisible() {

        mainScreen
                .shouldSeeMenuIcons();
    }

}
