package tests.mobile;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.SearchScreen;

@Tag("mobile")
@DisplayName("Поиск товаров")
@Epic("Мобильная версия")
@Feature("Функционал поиска")
public class SearchTest extends MobileBaseTest {

    SearchScreen searchScreen = new SearchScreen();

    @Test
    @DisplayName("После ввода 'чай' появляются подсказки")
    void searchSuggestionsShouldAppear() {

        searchScreen
                .typeSearchQuery("чай")
                .shouldSeeSuggestions();
    }

    @Test
    @DisplayName("Введённый текст отображается в поле поиска")
    void searchInputShouldContainText() {

        searchScreen
                .typeSearchQuery("чай")
                .shouldHaveSearchText("чай");
    }
}
