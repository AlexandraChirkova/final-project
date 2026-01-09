package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement titleCart = $(By.xpath("//h1[.='Корзина']"));
    private final SelenideElement productCartName = $(".cart-prod-info b");

    @Step("Проверяем тайтл Корзина")
    public CartPage checkCartTitle() {
        titleCart.isDisplayed();
        return this;
    }

    @Step("Получить название товара из корзины")
    public String getProductName() {
        return productCartName.getText();
    }


}
