package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DeliveryMode {

    private final SelenideElement pickUpPointAndDeliveryMode = $(".pick-point-layout");

    public DeliveryMode pickupPointShouldBeVisible() {
        pickUpPointAndDeliveryMode.shouldBe(visible);
        return this;

    }

}
