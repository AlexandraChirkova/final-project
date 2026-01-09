package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.CatalogPage;
import pages.MainPage;

@Tag("web")
@DisplayName("Поиск товаров")
public class SearchTest extends BaseTest{

    MainPage mainPage = new MainPage();
    CatalogPage catalogPage = new CatalogPage();

    @ValueSource(strings = {"смартфон", "Книги"})
    @ParameterizedTest(name = "Поиск товара: {0}")
    void searchProductByName(String searchQuery) {
        mainPage.openPage()
                .searchQuery(searchQuery);
        catalogPage.checkSearchResultTitle(searchQuery);

    }

}
