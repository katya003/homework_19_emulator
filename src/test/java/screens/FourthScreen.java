package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class FourthScreen {

    private final SelenideElement dataLocator = $(id("org.wikipedia.alpha:id/primaryTextView"));

    @Step("Проверить наличие текста над статьей")
    public void checkData() {
        $(dataLocator).shouldHave(text("Data & Privacy"));
    }
}
