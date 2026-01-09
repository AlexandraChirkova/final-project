package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class MainScreen {

    private final SelenideElement searchBar =
            $(id("kz.flip.mobile:id/toolbar"));

    private final ElementsCollection menuIcons =
            $$(id("kz.flip.mobile:id/scroll_categories_view"));

    @Step("Проверить, что строка поиска отображается на главной")
    public MainScreen shouldSeeSearchBar() {
        searchBar.shouldBe(visible);
        return this;
    }

    @Step("Проверить, что на главной отображаются иконки меню")
    public MainScreen shouldSeeMenuIcons() {
        menuIcons.shouldHave(sizeGreaterThan(0));
        return this;
    }
}
