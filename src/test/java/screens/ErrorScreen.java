package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ErrorScreen {

    private final SelenideElement textErrorElement = $(id("org.wikipedia.alpha:id/view_wiki_error_text"));

    @Step("Проверить текст сообщения об ошибке")
    public void checkTextError() {
        $(textErrorElement).shouldHave(text("An error occurred"));
    }
}
