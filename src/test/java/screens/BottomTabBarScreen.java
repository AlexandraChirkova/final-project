package screens;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

import org.openqa.selenium.By;

public class BottomTabBarScreen {

    public SelenideElement mainTab =
            $(By.xpath("//*[@content-desc='Главная']"));

    public SelenideElement searchTab =
            $(By.xpath("//*[@content-desc='Поиск']"));

    public SelenideElement cartTab =
            $(By.xpath("//*[@content-desc='Корзина']"));

    public SelenideElement favoritesTab =
            $(By.xpath("//*[@content-desc='Избранное']"));

    public SelenideElement profileTab =
            $(By.xpath("//*[@content-desc='Профиль']"));

    public void shouldBeVisible() {
        mainTab.shouldBe(visible);
        searchTab.shouldBe(visible);
        cartTab.shouldBe(visible);
        favoritesTab.shouldBe(visible);
        profileTab.shouldBe(visible);
    }
}
