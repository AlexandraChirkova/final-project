package tests.mobile;

import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.SearchScreen;

@Tag("mobile")
@DisplayName("Поиск товаров")
public class SearchTest extends MobileBaseTest{

    SearchScreen searchScreen = new SearchScreen();

    @Test
    @DisplayName("После ввода 'чай' появляются подсказки")
    void searchSuggestionsShouldAppear() {

        step("Ввести 'чай' в поиск", () ->
                searchScreen.typeSearchQuery("чай")
        );

        step("Проверить, что подсказки появились", () ->
                searchScreen.shouldSeeSuggestions()
        );
    }

    @Test
    @DisplayName("Введённый текст отображается в поле поиска")
    void searchInputShouldContainText() {

        searchScreen
                .typeSearchQuery("чай")
                .shouldHaveSearchText("чай");
    }
}
