package tests.mobile;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.BottomTabBarScreen;

import static com.codeborne.selenide.Condition.visible;
import static io.qameta.allure.Allure.step;

@Tag("mobile")
@DisplayName("Проверка таб бара")
@Epic("Мобильная версия")
@Feature("Проверка таб бара")
public class FlipBottomTabBarTest extends MobileBaseTest {

    BottomTabBarScreen bottomTabBar = new BottomTabBarScreen();

    @Test
    @DisplayName("На главной странице отображается нижний tab bar с иконками")
    void bottomTabBarShouldBeVisible() {

        step("Открыть главную страницу", () ->
                bottomTabBar.mainTab
                        .shouldBe(visible)
                        .click()
        );

        step("Проверить, что отображаются все иконки tab bar", () ->
                bottomTabBar.shouldBeVisible()
        );
    }
}
