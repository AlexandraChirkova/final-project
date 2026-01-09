package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static io.appium.java_client.AppiumBy.id;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchScreen {

    private final SelenideElement searchInput =
            $(id("kz.flip.mobile:id/search_edit_text"));

    private final ElementsCollection suggestions =
            $$(id("kz.flip.mobile:id/suggestion_text"));

    @Step("Ввести текст поиска: {query}")
    public SearchScreen typeSearchQuery(String query) {
        searchInput.shouldBe(visible).click();
        searchInput.sendKeys(query);
        return this;
    }

    @Step("Проверить, что подсказки появились")
    public SearchScreen shouldSeeSuggestions() {
        suggestions.shouldHave(sizeGreaterThan(0));
        return this;
    }

    @Step("Проверить, что текст поиска равен: {expected}")
    public SearchScreen shouldHaveSearchText(String expected) {
        searchInput.shouldHave(text(expected));
        return this;
    }

}
