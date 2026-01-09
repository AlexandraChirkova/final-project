package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private final SelenideElement addToCartButton = $("#cart_button");
    private final SelenideElement modalAddToCart = $("#add-to-cart-modal .modal");
    private final SelenideElement goToCartButton = $(".float-left");
    private final SelenideElement productName = $(".title-cart-add > a");
    private final SelenideElement closeModalAddToCart = $("#add-to-cart-modal .close");
    private final SelenideElement cartCount = $("#cart_cnt");

    @Step("Нажать кнопку добавить в корзину")
    public void addToCart() {
        addToCartButton.shouldBe(visible).click();
    }

    @Step("Модальное окно товар добавлен в корзину")
    public void modalAddToCartShouldBeVisible() {
        modalAddToCart.shouldBe(visible);

    }

    @Step("Получить название товара")
    public String getProductName() {
        return productName.getText();
    }

    @Step("Перейти в корзину")
    public void goToCart() {
        goToCartButton.shouldBe(visible).click();
    }

    @Step("Получить количество товара в корзине")
    public String getCartCount() {
        return cartCount.getText();
    }


}
