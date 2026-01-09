package pages;

import com.codeborne.selenide.SelenideElement;
import components.Languages;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement logoFlip= $("[alt='flip.kz']");
    private final SelenideElement langSwitcher =$(".lang-switcher");
    private final SelenideElement searchInput = $("#search_input");
    private final SelenideElement deliveryMode = $("[alt='Локация']");


    @Step("Открыть главную")
    public MainPage openPage() {
        open("/");
        logoFlip.shouldBe(visible);
        return this;
    }

    @Step("Выбрать язык")
    public MainPage switchLang() {
        langSwitcher.click();
        return this;
    }

    @Step("Выбрать RU или KZ")
    public MainPage chooseLang(Languages lang) {
        $("label[for='" + lang.code + "']").click();
        return this;
    }

    @Step("Проверить язык")
    public MainPage checkLang(Languages lang) {
        $(".auth-icon").shouldHave(text(lang.label));
        return this;
    }


    @Step("Поиск по запросу")
    public void searchQuery(String searchQuery) {
        searchInput.setValue(searchQuery).pressEnter();
    }

    @Step("Изменить способ доставки")
    public void selectDeliveryMode() {
        deliveryMode.click();

    }


}
