package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CatalogPage {

    private final SelenideElement searchResulTitle = $("h2.cell");
    private final SelenideElement grid = $(".good-grid");


    @Step("Проверяем результат поиска")
    public CatalogPage checkSearchResultTitle(String searchQuery) {
        searchResulTitle.shouldBe(visible).shouldHave(text(searchQuery));
        return this;
    }

    @Step("Выбираем первый товар из результата поиска")
    public void selectFirstProduct() {
        grid.shouldBe(visible);
        grid.$$(".new-product")
                .first()
                .$("a.product")
                .shouldBe(visible)
                .click();
    }
}
