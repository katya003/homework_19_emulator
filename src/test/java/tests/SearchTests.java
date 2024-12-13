
package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.ErrorScreen;
import screens.MainScreen;
import screens.ResultScreen;

@Tag("remote")
public class SearchTests extends TestBase {

    private final MainScreen mainScreen = new MainScreen();
    private final ResultScreen resultScreen = new ResultScreen();
    private final ErrorScreen errorScreen = new ErrorScreen();

    @Test
    void androidSuccessfulSearchTest() {
        mainScreen.searchWord("Appium");
        resultScreen.checkSearchResult();
    }

    @Test
    void androidUnsuccessfulAeroflotTest() {
        mainScreen.searchWord("Aeroflot");
        resultScreen.openOne();
        errorScreen.checkTextError();
    }
}