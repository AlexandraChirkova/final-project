package tests.web;

import components.DeliveryMode;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Tag("web")
@DisplayName("Проверка точек самовывоза и доставки")
@Epic("Способы доставки")
@Feature("Доставка и самовывоз")
public class PickupPointTest extends BaseTest {

    MainPage mainPage = new MainPage();
    DeliveryMode deliveryMode = new DeliveryMode();

    @Test
    @Story("Способы доставки")
    @Severity(SeverityLevel.NORMAL)
    @Owner("allure8")
    @AllureId("")
    @Description("Проверяем точки самовывоза и доставки")
    void pickUpPointTest() {
        mainPage.openPage()
                .selectDeliveryMode();
        deliveryMode.pickupPointShouldBeVisible();

    }
}
