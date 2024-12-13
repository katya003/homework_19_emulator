package components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchComponent {

    private final SelenideElement accessibilityLocator = $(accessibilityId("Search Wikipedia"));
    private final SelenideElement searchLocator = $(id("org.wikipedia.alpha:id/search_src_text"));

    @Step("Нажать на поле 'Поиск' ")
    public void clickFieldSearch() {
        $(accessibilityLocator).click();
    }

    @Step("Вписать слово в поле 'Поиск' ")
    public void readWord(String query) {
        searchLocator.sendKeys(query);
    }
}
