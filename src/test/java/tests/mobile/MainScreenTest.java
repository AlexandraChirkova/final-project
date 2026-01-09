package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import screens.MainScreen;

@Tag("mobile")
@DisplayName("Главная страница")
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
