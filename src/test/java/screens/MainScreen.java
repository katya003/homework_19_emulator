package screens;

import components.SearchComponent;
import io.qameta.allure.Step;

public class MainScreen {

    @Step("Вписать в поле 'Поиск' текст")
    public void searchWord(String query) {
        SearchComponent searchComponent = new SearchComponent();

        searchComponent.clickFieldSearch();
        searchComponent.readWord(query);

    }
}
