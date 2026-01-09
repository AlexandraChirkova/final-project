package tests.web;

import components.DeliveryMode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Tag("web")
@DisplayName("Проверка точек самовывоза и доставки")
public class PickupPointTest extends BaseTest {

    MainPage mainPage = new MainPage();
    DeliveryMode deliveryMode = new DeliveryMode();

    @Test
    void pickUpPointTest() {
        mainPage.openPage()
                .selectDeliveryMode();
        deliveryMode.pickupPointShouldBeVisible();

    }
}
