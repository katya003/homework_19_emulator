package screens;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

import static io.appium.java_client.AppiumBy.id;

public class ResultScreen {
    private final ElementsCollection oneListElements = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Открыть самую первую статью")
    public void openOne() {
        oneListElements.first().click();
    }

    @Step("Проверить, что статьи найдены")
    public void checkSearchResult() {
        assertThat(oneListElements).size().isGreaterThan(0);
    }
}
