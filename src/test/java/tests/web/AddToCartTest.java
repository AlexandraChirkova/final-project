package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.CatalogPage;
import pages.MainPage;
import pages.ProductPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("web")
@DisplayName("Добавление товара в корзину")
public class AddToCartTest extends BaseTest {

    MainPage mainPage = new MainPage();
    CatalogPage catalogPage = new CatalogPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();


    @Test
    public void addProductToCartTest() {
        mainPage.openPage()
                .searchQuery("Смартфон");
        catalogPage.selectFirstProduct();
        productPage.addToCart();
        productPage.modalAddToCartShouldBeVisible();
        String name = productPage.getProductName();
        productPage.goToCart();
        cartPage.checkCartTitle();
        String cartName = cartPage.getProductName();
        assertTrue(cartName.contains(name),
                "Ожидалось, что '" + cartName + "' содержит '" + name + "'");

    }

    @Test
    public void checkCountCartTest() {
        mainPage.openPage()
                .searchQuery("Смартфон");
        catalogPage.selectFirstProduct();
        productPage.addToCart();
        productPage.goToCart();
        assertTrue(productPage.getCartCount().contains("1 товар"));

    }
}
